/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.defaults;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class AbsoluteIntake extends Command {

	public AbsoluteIntake() {
		requires(Robot.intake);
	}

  protected void execute() {
		Robot.intake.intakeControl();
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
    Robot.intake.stopMoving();
  }
	
	protected void interrupted() {
		Robot.intake.stopMoving();
  }
  
}
