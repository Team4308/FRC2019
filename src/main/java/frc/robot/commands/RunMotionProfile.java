package frc.robot.commands;

import com.ctre.phoenix.motion.SetValueMotionProfile;

import frc.robot.Robot;
import frc.robot.motionprofiling.*;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotionProfile extends Command {
    
	public MPRunner leftProfile;
    public MPRunner rightProfile;

    private GeneratedMotionProfile _profile;
    	
	public RunMotionProfile(GeneratedMotionProfile profile) {
        requires(Robot.drive);
        _profile = profile;
    }

    public RunMotionProfile(double dist, double angle) {
        requires(Robot.drive);
        CreatePath path = new CreatePath(dist, angle);
        _profile = path.getProfile();
    }
    
    protected void initialize() {
        Robot.drive.resetSensors();

        setTimeout(_profile.kNumPoints()*_profile.kTimeStep());

		leftProfile = new MPRunner(Robot.drive.getLeftTalon(), _profile.kNumPoints(), _profile.leftPoints(), _profile.bForward());
		rightProfile = new MPRunner(Robot.drive.getRightTalon(), _profile.kNumPoints(), _profile.rightPoints(), _profile.bForward());
    
        leftProfile.startMotionProfile();
        rightProfile.startMotionProfile();
    }
	
	protected void execute() {
        leftProfile.control();
        rightProfile.control();
        
        SetValueMotionProfile setOutputLeft = leftProfile.getSetValue();
        SetValueMotionProfile setOutputRight = rightProfile.getSetValue();

        Robot.drive.setMPDrive(setOutputLeft.value, setOutputRight.value);
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
