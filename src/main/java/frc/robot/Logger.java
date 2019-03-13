package frc.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Logger {

    public Logger() {

        // SmartDashboard.putNumber("Elevator P", RobotMap.Elevator.MotionControl.kP);
        // SmartDashboard.putNumber("Elevator I", RobotMap.Elevator.MotionControl.kI);
        // SmartDashboard.putNumber("Elevator D", RobotMap.Elevator.MotionControl.kD);

        // SmartDashboard.putNumber("Drive P", RobotMap.Drive.MotionControl.kLeftP);
        // SmartDashboard.putNumber("Drive I", RobotMap.Drive.MotionControl.kLeftI);
        // SmartDashboard.putNumber("Drive D", RobotMap.Drive.MotionControl.kLeftD);
    }

    public void log() {
        
        SmartDashboard.putNumber("Left X", OI.driveStick.getRawAxis(RobotMap.Control.Standard.leftX));        
        SmartDashboard.putNumber("Left Y", OI.driveStick.getRawAxis(RobotMap.Control.Standard.leftY));
        SmartDashboard.putNumber("Right X", OI.driveStick.getRawAxis(RobotMap.Control.Standard.rightX));
        SmartDashboard.putNumber("Right Y", OI.driveStick.getRawAxis(RobotMap.Control.Standard.rightY));

        SmartDashboard.putNumber("Operator Right Y", OI.controlStick.getRawAxis(RobotMap.Control.Standard.rightY));

        SmartDashboard.putNumber("Left Drive Input", OI.getDriveSchemeLeft());
        SmartDashboard.putNumber("Right Drive Input", OI.getDriveSchemeRight());
        
        SmartDashboard.putNumber("Left Drive Output", Robot.drive.getDriveLeft());
        SmartDashboard.putNumber("Right Drive Output", Robot.drive.getDriveRight());

        SmartDashboard.putNumber("Elevator Input", OI.getElevatorScheme());
        SmartDashboard.putNumber("Elevator Output", Robot.elevator.getElevator());

        // SmartDashboard.putNumber("Current - Front Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.frontLeft));
        // SmartDashboard.putNumber("Current - Back Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.backLeft));
        // SmartDashboard.putNumber("Current - Top Left Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.topLeft));
        // SmartDashboard.putNumber("Current - Front Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.frontRight));
        // SmartDashboard.putNumber("Current - Back Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.backRight));
        // SmartDashboard.putNumber("Current - Top Right Motor", Robot.pdp.getCurrent(RobotMap.Power.Drive.topRight));
        // SmartDashboard.putNumber("Current - Left Elevator Motor", Robot.pdp.getCurrent(RobotMap.Power.Elevator.leftElevator));
        // SmartDashboard.putNumber("Current - Right Elevator Motor", Robot.pdp.getCurrent(RobotMap.Power.Elevator.rightElevator));
    
        SmartDashboard.putNumber("Left Drive Position", Robot.drive.getLeftSensorPosition());
        SmartDashboard.putNumber("Right Drive Position", Robot.drive.getRightSensorPosition());
        // SmartDashboard.putNumber("Left Drive Velocity", Robot.drive.getLeftSensorVelocity());
        // SmartDashboard.putNumber("Right Drive Velocity", Robot.drive.getRightSensorVelocity());

        SmartDashboard.putNumber("Elevator Position", Robot.elevator.getSensorPosition());
        SmartDashboard.putNumber("Elevator Position (Inches)", Robot.elevator.getSensorPositionInInches());
        SmartDashboard.putNumber("Elevator Target Position", Robot.elevator.getTargetPosition());
        SmartDashboard.putNumber("Elevator Target Position (Inches)", Robot.elevator.getTargetPositionInInches());

        SmartDashboard.putNumber("Arm Position", Robot.arm.getSensorPosition());
        SmartDashboard.putNumber("Arm Position (Inches)", Robot.arm.getSensorPositionInDegrees());
        SmartDashboard.putNumber("Arm Target Position", Robot.arm.getTargetPosition());
        SmartDashboard.putNumber("Arm Target Position (Inches)", Robot.arm.getTargetPositionInDegrees());

        // SmartDashboard.putNumber("Elevator Velocity", Robot.elevator.getSensorVelocity());

        // SmartDashboard.putNumber("Gyro Angle", Robot.gyro.getAngle());

        // SmartDashboard.putNumber("Ultrasonic Distance", Robot.ultrasonic.getDistance());

        // SmartDashboard.putNumber("Camera Tape Yaw", Robot.camera.getTapeYaw());
        // SmartDashboard.putNumber("Camera Tape Distance", Robot.camera.getTapeDistance());

        // System.out.println(Robot.elevator.getTargetPositionInInches());
    
    }

}