package frc.robot.subsystems.defaults;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class AbsoluteGyroscope extends Command {
	
	public AbsoluteGyroscope() {
		requires(Robot.gyro);
	}
	
	protected void execute() {
		Robot.gyro.gyroControl();
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {
    	
    }
	
	protected void interrupted() {
		
	}

}