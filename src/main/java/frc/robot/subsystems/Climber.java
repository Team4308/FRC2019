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

public class Climber extends Subsystem {
 
  private DoubleSolenoid solenoidLeftClimb, solenoidRightClimb;

  private boolean climbEnabled = false;

  public void setClimb(boolean climbEnabled) {
    this.climbEnabled = climbEnabled;
  }
  public boolean getClimbEnabled() {
    return climbEnabled;
  }

  public enum ClimberState {
    IN, OUT, OFF
  }

  private ClimberState climberState;

  public Climber() {
    solenoidLeftClimb = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.Climber.solenoidLeftClimberOut, RobotMap.Climber.solenoidLeftClimberIn);
    solenoidRightClimb = new DoubleSolenoid(RobotMap.PCM_ID, RobotMap.Climber.solenoidRightClimberOut, RobotMap.Climber.solenoidRightClimberIn);
    solenoidLeftClimb.set(DoubleSolenoid.Value.kReverse);
    solenoidRightClimb.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void switchClimber() {
		if (climberState == ClimberState.IN) {
			pushClimber();
		} else {
			pullClimber();
		}
	}
	
	public void pushClimber() {
    if(!climbEnabled)
      return;

    solenoidLeftClimb.set(DoubleSolenoid.Value.kForward);
    solenoidRightClimb.set(DoubleSolenoid.Value.kForward);
		climberState = ClimberState.OUT;
	}
	
	public void pullClimber() {
    if(!climbEnabled)
      return;

    solenoidLeftClimb.set(DoubleSolenoid.Value.kReverse);
    solenoidRightClimb.set(DoubleSolenoid.Value.kReverse);
		climberState = ClimberState.IN;
	}
	
	public void climberOff() {
    if(!climbEnabled)
      return;

    solenoidLeftClimb.set(DoubleSolenoid.Value.kOff);
    solenoidRightClimb.set(DoubleSolenoid.Value.kOff);
    climberState = ClimberState.OFF;
  }
}
