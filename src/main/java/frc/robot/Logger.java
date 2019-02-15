package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Logger {

    public Logger() {

    }

    public void log() {
        
        SmartDashboard.putNumber("Left X", OI.driveStick.getRawAxis(RobotMap.Control.Standard.leftX));        
        SmartDashboard.putNumber("Left Y", OI.driveStick.getRawAxis(RobotMap.Control.Standard.leftY));
        SmartDashboard.putNumber("Right X", OI.driveStick.getRawAxis(RobotMap.Control.Standard.rightX));
        SmartDashboard.putNumber("Right Y", OI.driveStick.getRawAxis(RobotMap.Control.Standard.rightY));

        SmartDashboard.putNumber("Left Drive Input", OI.getDriveSchemeLeft());
        SmartDashboard.putNumber("Right Drive Input", OI.getDriveSchemeRight());
        
        SmartDashboard.putNumber("Left Drive Output", Robot.drive.getDriveLeft());
        SmartDashboard.putNumber("Right Drive Output", Robot.drive.getDriveRight());

        SmartDashboard.putNumber("Current - Front Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.frontLeft));
        SmartDashboard.putNumber("Current - Back Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.backLeft));
        SmartDashboard.putNumber("Current - Top Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.topLeft));
        SmartDashboard.putNumber("Current - Front Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.frontRight));
        SmartDashboard.putNumber("Current - Back Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.backRight));
        SmartDashboard.putNumber("Current - Top Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.topRight));
    
        SmartDashboard.putNumber("Left Drive Position", Robot.drive.getLeftSensorPosition());
        SmartDashboard.putNumber("Right Drive Position", Robot.drive.getRightSensorPosition());

        SmartDashboard.putNumber("Gyro Angle", Robot.gyro.getAngle());

        SmartDashboard.putNumber("Ultrasonic Distance", Robot.ultrasonic.getDistance());

        SmartDashboard.putNumber("Camera Tape Yaw", Robot.camera.getTapeYaw());
        SmartDashboard.putNumber("Camera Tape Distance", Robot.camera.getTapeDistance());
    
    }

}