/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.subsystems.defaults.AbsoluteIntake;
import frc.robot.OI;

/**
 * Add your docs here.
 */
public class Intake extends Subsystem {
  
  private TalonSRX intakeMotor;

  public Intake() {

    intakeMotor = new TalonSRX(RobotMap.Intake.motor);

    intakeMotor.configFactoryDefault();

    intakeMotor.configOpenloopRamp(RobotMap.Intake.Power.kOpenloopRamp, 0);
    intakeMotor.configContinuousCurrentLimit(RobotMap.Intake.Power.kContinuousCurrentLimit, 0); // 10
    intakeMotor.configPeakCurrentLimit(RobotMap.Intake.Power.kPeakCurrentLimit, 0);  // 15
    intakeMotor.configPeakCurrentDuration(RobotMap.Intake.Power.kPeakDuration, 0);
    intakeMotor.enableCurrentLimit(true);

    intakeMotor.setInverted(false);
    
    intakeMotor.setNeutralMode(NeutralMode.Brake);

    intakeMotor.configNeutralDeadband(RobotMap.Intake.Speed.kDeadband);

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new AbsoluteIntake());
  }

  public void intakeControl() {
    intakeMotor.set(ControlMode.PercentOutput, OI.getIntakeScheme());
  }

  public void stopMoving() {
    intakeMotor.set(ControlMode.PercentOutput, 0.0);
  }

}
