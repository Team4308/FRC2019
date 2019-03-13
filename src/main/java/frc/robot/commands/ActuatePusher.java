/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ActuatePusher extends Command {

  public enum PusherAction {
    PUSH, PULL, SWITCH, OFF
  }

  private PusherAction action;

  public ActuatePusher(PusherAction choose) {
    requires(Robot.hatchGrabber);

    action = choose;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    switch(action) {
      case SWITCH:
        Robot.hatchGrabber.switchPusher();
        break;
      case PUSH:
        Robot.hatchGrabber.pushHatch();
        break;
      case PULL:
        Robot.hatchGrabber.pullHatch();
        break;
      case OFF:
        Robot.hatchGrabber.pusherOff();
        break;
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

}
