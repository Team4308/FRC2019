package frc.robot.subsystems.defaults;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AbsoluteDrive extends Command {
	
	public AbsoluteDrive() {
		requires(Robot.drive);
	}
	
	protected void execute() {
		Robot.drive.driveControl();
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
    	Robot.drive.stopMoving();
    }
	
	protected void interrupted() {
		Robot.drive.stopMoving();
	}

}