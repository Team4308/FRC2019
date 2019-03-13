/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ActuateClaw extends Command {

  public enum ClawAction {
    GRAB, RELEASE, SWITCH, OFF
  }

  private ClawAction action;

  public ActuateClaw(ClawAction choose) {
    requires(Robot.hatchGrabber);

    action = choose;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    switch(action) {
      case SWITCH:
        Robot.hatchGrabber.switchClaw();
        break;
      case GRAB:
        Robot.hatchGrabber.grabHatch();
        break;
      case RELEASE:
        Robot.hatchGrabber.releaseHatch();
        break;
      case OFF:
        Robot.hatchGrabber.clawOff();
        break;
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

}
