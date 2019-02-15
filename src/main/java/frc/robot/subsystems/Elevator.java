/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
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
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.subsystems.defaults.AbsoluteElevator;

/**
 * Add your docs here.
 */
public class Elevator extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private TalonSRX leftElevator, rightElevator;
  private ArrayList<TalonSRX> elevatorMotors = new ArrayList<>();

  private double currentTargetPosition = 0;

  public Elevator() {

    leftElevator = new TalonSRX(RobotMap.Elevator.left);
    elevatorMotors.add(leftElevator);
    rightElevator = new TalonSRX(RobotMap.Elevator.right);
    elevatorMotors.add(rightElevator);

    for(TalonSRX talon : elevatorMotors) {

      talon.configFactoryDefault();

      talon.configOpenloopRamp(RobotMap.Elevator.Power.kOpenloopRamp, 0);
      talon.configContinuousCurrentLimit(RobotMap.Elevator.Power.kContinuousCurrentLimit, 0); // 10
      talon.configPeakCurrentLimit(RobotMap.Elevator.Power.kPeakCurrentLimit, 0);  // 15
      talon.configPeakCurrentDuration(RobotMap.Elevator.Power.kPeakDuration, 0);
      talon.enableCurrentLimit(true);

      talon.setInverted(false);
      
      talon.setNeutralMode(NeutralMode.Brake);

      talon.configNeutralDeadband(RobotMap.Elevator.Speed.kDeadband);
    }

    rightElevator.follow(leftElevator);

    stopMoving();

    leftElevator.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
    leftElevator.setSensorPhase(true); 
    
		leftElevator.config_kF(0, RobotMap.Elevator.MotionControl.kFeedForward, RobotMap.Elevator.MotionControl.kTimeoutMs);
		leftElevator.config_kP(0, RobotMap.Elevator.MotionControl.kP, RobotMap.Elevator.MotionControl.kTimeoutMs);
		leftElevator.config_kI(0, RobotMap.Elevator.MotionControl.kI, RobotMap.Elevator.MotionControl.kTimeoutMs);
		leftElevator.config_kD(0, RobotMap.Elevator.MotionControl.kD, RobotMap.Elevator.MotionControl.kTimeoutMs);
		leftElevator.configMotionProfileTrajectoryPeriod(RobotMap.Elevator.MotionControl.kTrajectoryPeriod, RobotMap.Elevator.MotionControl.kTimeoutMs); 

    leftElevator.configMotionCruiseVelocity(RobotMap.Elevator.MotionControl.kCruiseVelocity, RobotMap.Elevator.MotionControl.kTimeoutMs);
    leftElevator.configMotionAcceleration(RobotMap.Elevator.MotionControl.kAcceleration, RobotMap.Elevator.MotionControl.kTimeoutMs);

    resetSensors();

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new AbsoluteElevator());
  }

  public void elevatorControl() {
    double operatorInput = OI.getElevatorScheme();

    if (Math.abs(operatorInput) > 0) {
      leftElevator.set(ControlMode.PercentOutput, operatorInput);
      currentTargetPosition = getSensorPosition();
    }
    else {
      leftElevator.set(ControlMode.MotionMagic, currentTargetPosition);
    }

  }

  public void stopMoving() {
    leftElevator.set(ControlMode.PercentOutput, 0.0);
  }

  public void setTargetPosition(double targetPos) {
    currentTargetPosition = targetPos;
  }

  public double getSensorPosition() {
		return leftElevator.getSelectedSensorPosition(0) * RobotMap.Elevator.MotionControl.kEncoderCountsToInches;
	}

  public void resetSensors() {
		leftElevator.setSelectedSensorPosition(0, 0, 0);
		leftElevator.setSelectedSensorPosition(0, 0, 0);
	}


}