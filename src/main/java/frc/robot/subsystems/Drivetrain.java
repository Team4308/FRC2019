/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.RobotMap;
// import frc.robot.subsystems.defaults.AbsoluteDrive;


public class Drivetrain extends Subsystem {

  private TalonSRX frontLeft, frontRight, backLeft, backRight, topLeft, topRight;

  private ArrayList<TalonSRX> driveMotors = new ArrayList<>();

  private boolean motionProfileMode = false;

  public boolean reverseDrive = false;


  public Drivetrain() {

    // INITIALIZE TALONS
    frontLeft = new TalonSRX(RobotMap.Drive.frontLeft);
    driveMotors.add(frontLeft);
    backLeft = new TalonSRX(RobotMap.Drive.backLeft);
    driveMotors.add(backLeft);
    topLeft = new TalonSRX(RobotMap.Drive.topLeft); 
    driveMotors.add(topLeft);

    frontRight = new TalonSRX(RobotMap.Drive.frontRight);
    driveMotors.add(frontRight);
    backRight = new TalonSRX(RobotMap.Drive.backRight);
    driveMotors.add(backRight);
    topRight = new TalonSRX(RobotMap.Drive.topRight);
    driveMotors.add(topRight);

    for(TalonSRX talon : driveMotors) {

      talon.configFactoryDefault();

      talon.configOpenloopRamp(RobotMap.Drive.Power.kOpenloopRamp, 0);
      talon.configContinuousCurrentLimit(RobotMap.Drive.Power.kContinuousCurrentLimit, 0); // 10
      talon.configPeakCurrentLimit(RobotMap.Drive.Power.kPeakCurrentLimit, 0);  // 15
      talon.configPeakCurrentDuration(RobotMap.Drive.Power.kPeakDuration, 0);
      talon.enableCurrentLimit(true);

      talon.setInverted(false);
        
      talon.setNeutralMode(NeutralMode.Coast);

      talon.configNeutralDeadband(RobotMap.Drive.Speed.kDeadband);
    }

    frontRight.setInverted(true);
    backRight.setInverted(true);
    topRight.setInverted(true);

    topLeft.follow(frontLeft);
    topRight.follow(frontRight);
    backLeft.follow(frontLeft);
    backRight.follow(frontRight);

    stopMoving();

    // SETUP SENSORS AND MOTION CONTROL
    frontLeft.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
    frontLeft.setSensorPhase(false); 
    
		frontLeft.config_kF(0, RobotMap.Drive.MotionControl.kLeftFeedForward, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontLeft.config_kP(0, RobotMap.Drive.MotionControl.kLeftP, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontLeft.config_kI(0, RobotMap.Drive.MotionControl.kLeftI, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontLeft.config_kD(0, RobotMap.Drive.MotionControl.kLeftD, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontLeft.configMotionProfileTrajectoryPeriod(RobotMap.Drive.MotionControl.kTrajectoryPeriod, RobotMap.Drive.MotionControl.kTimeoutMs); 
		// frontLeft.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.Drive.MotionControl.kTimeoutMs);
    frontLeft.selectProfileSlot(0, 0);

		frontRight.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
    frontRight.setSensorPhase(false);
    
		frontRight.config_kF(0, RobotMap.Drive.MotionControl.kRightFeedForward, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontRight.config_kP(0, RobotMap.Drive.MotionControl.kRightP, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontRight.config_kI(0, RobotMap.Drive.MotionControl.kRightI, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontRight.config_kD(0, RobotMap.Drive.MotionControl.kRightD, RobotMap.Drive.MotionControl.kTimeoutMs);
		frontRight.configMotionProfileTrajectoryPeriod(RobotMap.Drive.MotionControl.kTrajectoryPeriod, RobotMap.Drive.MotionControl.kTimeoutMs); 
    // frontRight.setStatusFramePeriod(StatusFrameEnhanced.Status_10_MotionMagic, 10, RobotMap.Drive.MotionControl.kTimeoutMs);
    frontRight.selectProfileSlot(0, 0);

    resetSensors();

    motionProfileMode = false;

  }

  public TalonSRX getLeftTalon() {
    return frontLeft;
  }
  public TalonSRX getRightTalon() {
    return frontRight;
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new AbsoluteDrive());
  }

  public void driveControl() {
    if (OI.driveStick.getRawButton(RobotMap.Control.Standard.start)) {
      System.out.println("Reset" + SmartDashboard.getNumber("Drive P", RobotMap.Drive.MotionControl.kLeftP));

      frontLeft.config_kP(0, SmartDashboard.getNumber("Drive P", RobotMap.Drive.MotionControl.kLeftP), RobotMap.Drive.MotionControl.kTimeoutMs);
		  frontLeft.config_kI(0, SmartDashboard.getNumber("Drive I", RobotMap.Drive.MotionControl.kLeftI), RobotMap.Drive.MotionControl.kTimeoutMs);
		  frontLeft.config_kD(0, SmartDashboard.getNumber("Drive D", RobotMap.Drive.MotionControl.kLeftD), RobotMap.Drive.MotionControl.kTimeoutMs);
    
      frontRight.config_kP(0, SmartDashboard.getNumber("Drive P", RobotMap.Drive.MotionControl.kRightP), RobotMap.Drive.MotionControl.kTimeoutMs);
		  frontRight.config_kI(0, SmartDashboard.getNumber("Drive I", RobotMap.Drive.MotionControl.kRightI), RobotMap.Drive.MotionControl.kTimeoutMs);
		  frontRight.config_kD(0, SmartDashboard.getNumber("Drive D", RobotMap.Drive.MotionControl.kRightD), RobotMap.Drive.MotionControl.kTimeoutMs);
    }

    if (!motionProfileMode) {
      setDrive(OI.getDriveSchemeLeft(), OI.getDriveSchemeRight());
    }
  }

  public void setDrive(double left, double right) {
    frontLeft.set(ControlMode.PercentOutput, left);
    frontRight.set(ControlMode.PercentOutput, right);
  }

  public void setMPDrive(double left, double right) {
    motionProfileMode = true;
		frontLeft.set(ControlMode.MotionProfile, left);
		frontRight.set(ControlMode.MotionProfile, right);
	}

  public double getDriveLeft() {
    return frontLeft.getMotorOutputPercent();
  }

  public double getDriveRight() {
    return frontRight.getMotorOutputPercent();
  }

  public void stopMoving() {
    motionProfileMode = false;
    setDrive(0.0, 0.0);
  }


  public double getLeftSensorPosition() {
		return frontLeft.getSelectedSensorPosition(0) * RobotMap.Drive.MotionControl.kEncoderInchesPerCount;
	}
	public double getRightSensorPosition() {
		return frontRight.getSelectedSensorPosition(0) * RobotMap.Drive.MotionControl.kEncoderInchesPerCount;
  }
  
  public double getLeftSensorVelocity() {
    return frontLeft.getSelectedSensorVelocity(0);
  }
	public double getRightSensorVelocity() {
    return frontRight.getSelectedSensorVelocity(0);
  }

  public void resetSensors() {
		frontLeft.setSelectedSensorPosition(0, 0, 0);
		frontRight.setSelectedSensorPosition(0, 0, 0);
	}

}