/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class HatchGrabber extends Subsystem {

  private DoubleSolenoid solenoidClaw, solenoidPusher;

  public enum ClawState {
		GRAB, RELEASE, OFF
  }
  
  public enum PusherState {
    IN, OUT, OFF
  }

  private ClawState clawState;
  private PusherState pusherState;

  public HatchGrabber() {
    solenoidClaw = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.HatchGrabber.solenoidClawOut, RobotMap.HatchGrabber.solenoidClawIn);
		solenoidPusher = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.HatchGrabber.solenoidPusherOut, RobotMap.HatchGrabber.solenoidPusherIn);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void switchClaw() {
		if (clawState == ClawState.GRAB) {
			releaseHatch();
		} else {
			grabHatch();
		}
	}
	
	public void grabHatch() {
		solenoidClaw.set(DoubleSolenoid.Value.kForward);
		clawState = ClawState.GRAB;
	}
	
	public void releaseHatch() {
		solenoidClaw.set(DoubleSolenoid.Value.kReverse);
		clawState = ClawState.RELEASE;
	}
	
	public void clawOff() {
		solenoidClaw.set(DoubleSolenoid.Value.kOff);
    clawState = ClawState.OFF;
  }
  
  public void switchPusher() {
		if (pusherState == PusherState.OUT) {
			pullHatch();
		} else {
			pushHatch();
		}
	}
	
	public void pushHatch() {
		solenoidPusher.set(DoubleSolenoid.Value.kForward);
		pusherState = PusherState.OUT;
	}
	
	public void pullHatch() {
		solenoidPusher.set(DoubleSolenoid.Value.kReverse);
		pusherState = PusherState.IN;
	}
	
	public void pusherOff() {
		solenoidPusher.set(DoubleSolenoid.Value.kOff);
    pusherState = PusherState.OFF;
  }

}
