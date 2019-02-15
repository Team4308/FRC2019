package frc.robot.motionprofiling;

import com.ctre.phoenix.motion.SetValueMotionProfile;

import frc.robot.OI;
import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotionProfile extends Command {
    
	public MPRunner leftProfile;
    public MPRunner rightProfile;

    protected GeneratedMotionProfile _profile;  // MUST BE SET BEFORE RUNNING
    
    public RunMotionProfile(GeneratedMotionProfile profile) {
        requires(Robot.drive);
        _profile = profile;
    }

	public RunMotionProfile() {
        requires(Robot.drive);
    }
    
    @Override
    protected void initialize() {
        Robot.drive.resetSensors();

        setTimeout(_profile.kNumPoints()*_profile.kTimeStep());

		leftProfile = new MPRunner(Robot.drive.getLeftTalon(), _profile.kNumPoints(), _profile.leftPoints(), _profile.bForward());
		rightProfile = new MPRunner(Robot.drive.getRightTalon(), _profile.kNumPoints(), _profile.rightPoints(), _profile.bForward());
    
        leftProfile.startMotionProfile();
        rightProfile.startMotionProfile();
    }
    
    @Override
	protected void execute() {

        leftProfile.control();
        rightProfile.control();
        
        SetValueMotionProfile setOutputLeft = leftProfile.getSetValue();
        SetValueMotionProfile setOutputRight = rightProfile.getSetValue();

        Robot.drive.setMPDrive(setOutputLeft.value, setOutputRight.value);
    }

    @Override
	protected boolean isFinished() {
		return isTimedOut() || OI.getDriveSchemeLeft() > 0 || OI.getDriveSchemeRight() > 0;
	}
    
    @Override
	protected void end() {
        Robot.drive.stopMoving();
        leftProfile.reset();
        rightProfile.reset();
    }
    
    @Override
	protected void interrupted() {
		end();
	}

}