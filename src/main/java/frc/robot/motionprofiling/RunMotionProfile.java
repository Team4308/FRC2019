package frc.robot.motionprofiling;

import com.ctre.phoenix.motion.SetValueMotionProfile;

import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotionProfile extends Command {
    
	public MPRunner leftProfile;
    public MPRunner rightProfile;
    	
	public RunMotionProfile(GeneratedMotionProfile profile) {
        requires(Robot.drive);

        setTimeout(profile.kNumPoints()*profile.kTimeStep());

		leftProfile = new MPRunner(Robot.drive.getLeftTalon(), profile.kNumPoints(), profile.leftPoints(), profile.bForward());
		rightProfile = new MPRunner(Robot.drive.getRightTalon(), profile.kNumPoints(), profile.rightPoints(), profile.bForward());
	}
	
	protected void execute() {
        leftProfile.control();
        rightProfile.control();
        
        SetValueMotionProfile setOutputLeft = leftProfile.getSetValue();
        SetValueMotionProfile setOutputRight = rightProfile.getSetValue();

        Robot.drive.setMPDrive(setOutputLeft.value, setOutputRight.value);
    }
    
    protected void initialize() {
        leftProfile.startMotionProfile();
        rightProfile.startMotionProfile();
    }

	protected boolean isFinished() {
		return isTimedOut();
	}
	
	protected void end() {
        Robot.drive.stopMoving();
        leftProfile.reset();
        rightProfile.reset();
    }
	
	protected void interrupted() {
		end();
	}

}
