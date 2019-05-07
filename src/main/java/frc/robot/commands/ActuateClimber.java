/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ActuateClimber extends Command {

  public enum ClimberAction {
    PUSH, PULL, SWITCH, OFF
  }

  private ClimberAction action;

  public ActuateClimber(ClimberAction choose) {
    requires(Robot.climber);

    action = choose;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    switch(action) {
      case SWITCH:
        Robot.climber.switchClimber();
        break;
      case PUSH:
        Robot.climber.pushClimber();
        break;
      case PULL:
        Robot.climber.pullClimber();
        break;
      case OFF:
        Robot.climber.climberOff();
        break;
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }
}
