/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {

  private TalonSRX armMotor;

  private double currentTargetPosition = 0;
  private boolean motionMagicMode = false;

  public Arm() {

    armMotor = new TalonSRX(RobotMap.Arm.motor);

    armMotor.configFactoryDefault();

    armMotor.configOpenloopRamp(RobotMap.Elevator.Power.kOpenloopRamp, 0);
    armMotor.configContinuousCurrentLimit(RobotMap.Elevator.Power.kContinuousCurrentLimit, 0); // 10
    armMotor.configPeakCurrentLimit(RobotMap.Elevator.Power.kPeakCurrentLimit, 0);  // 15
    armMotor.configPeakCurrentDuration(RobotMap.Elevator.Power.kPeakDuration, 0);
    armMotor.enableCurrentLimit(true);

    armMotor.setInverted(false);
    
    armMotor.setNeutralMode(NeutralMode.Brake);

    armMotor.configNeutralDeadband(RobotMap.Elevator.Speed.kDeadband);

    stopMoving();

    armMotor.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
    armMotor.setSensorPhase(false); 
    
		armMotor.config_kF(0, RobotMap.Elevator.MotionControl.kFeedForward, RobotMap.Elevator.MotionControl.kTimeoutMs);
		armMotor.config_kP(0, RobotMap.Elevator.MotionControl.kP, RobotMap.Elevator.MotionControl.kTimeoutMs);
		armMotor.config_kI(0, RobotMap.Elevator.MotionControl.kI, RobotMap.Elevator.MotionControl.kTimeoutMs);
		armMotor.config_kD(0, RobotMap.Elevator.MotionControl.kD, RobotMap.Elevator.MotionControl.kTimeoutMs);
		armMotor.configMotionProfileTrajectoryPeriod(RobotMap.Elevator.MotionControl.kTrajectoryPeriod, RobotMap.Elevator.MotionControl.kTimeoutMs); 

    armMotor.configMotionCruiseVelocity(RobotMap.Elevator.MotionControl.kCruiseVelocity, RobotMap.Elevator.MotionControl.kTimeoutMs);
    armMotor.configMotionAcceleration(RobotMap.Elevator.MotionControl.kAcceleration, RobotMap.Elevator.MotionControl.kTimeoutMs);

    resetSensors();

  }

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new AbsoluteElevator());
  }

  public void armControl() {

    double operatorInput = OI.getArmScheme();

    // if (Math.abs(operatorInput) > 0) {
    //   motionMagicMode = false;
    // }

    // if (motionMagicMode) {
    //   armMotor.set(ControlMode.MotionMagic, currentTargetPosition);
    // }
    // else {
      if (Math.abs(operatorInput) > 0) {
        armMotor.set(ControlMode.PercentOutput, operatorInput);
      }
      else {
        armMotor.set(ControlMode.PercentOutput, RobotMap.Arm.Speed.kBrake);
      }
    // }
    
  }

  public double getArm() {
    return armMotor.getMotorOutputPercent();
  }

  public void stopMoving() {
    armMotor.set(ControlMode.PercentOutput, 0.0);
  }

  public void setTargetPosition(double targetPosInDegrees) {
    currentTargetPosition = -targetPosInDegrees/RobotMap.Arm.MotionControl.kEncoderDegreesPerCount;
    motionMagicMode = true;
  }

  public double getTargetPosition() {
    return currentTargetPosition;
  }

  public double getTargetPositionInDegrees() {
    return currentTargetPosition * RobotMap.Arm.MotionControl.kEncoderDegreesPerCount;
  }

  public double getSensorPosition() {
    return armMotor.getSelectedSensorPosition(0);
  }

  public double getSensorPositionInDegrees() {
    return armMotor.getSelectedSensorPosition(0) * RobotMap.Arm.MotionControl.kEncoderDegreesPerCount;
  }

  public double getSensorVelocity() {
    return armMotor.getSelectedSensorVelocity(0);
  }

  public void resetSensors() {
		armMotor.setSelectedSensorPosition(0, 0, 0);
  }
  
}