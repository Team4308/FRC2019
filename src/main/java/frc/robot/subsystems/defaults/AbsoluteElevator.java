package frc.robot.subsystems.defaults;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AbsoluteElevator extends Command {
	
	protected void execute() {
		Robot.elevator.elevatorControl();
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
    	Robot.elevator.stopMoving();
    }
	
	protected void interrupted() {
		Robot.elevator.stopMoving();
	}

}