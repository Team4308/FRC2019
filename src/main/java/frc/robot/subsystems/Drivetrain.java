/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import java.util.ArrayList;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.AbsoluteDrive;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Drivetrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX frontLeft, frontRight, backLeft, backRight, miniLeft, miniRight;

  private ArrayList<WPI_TalonSRX> leftMotors = new ArrayList<>(), rightMotors = new ArrayList<>();

  public Drivetrain() {
    frontLeft = new WPI_TalonSRX(RobotMap.Drive.frontLeft);
    leftMotors.add(frontLeft);
    backLeft = new WPI_TalonSRX(RobotMap.Drive.backLeft);
    leftMotors.add(backLeft);
    miniLeft = new WPI_TalonSRX(RobotMap.Drive.miniLeft); 
    leftMotors.add(miniLeft);

    frontRight = new WPI_TalonSRX(RobotMap.Drive.frontRight);
    rightMotors.add(frontRight);
    backRight = new WPI_TalonSRX(RobotMap.Drive.backRight);
    rightMotors.add(backRight);
    miniRight = new WPI_TalonSRX(RobotMap.Drive.miniRight);
    rightMotors.add(miniRight);

    for(WPI_TalonSRX talon : leftMotors) {
        talon.configOpenloopRamp(0, 0);
        talon.configContinuousCurrentLimit(35, 0); // 10
        talon.configPeakCurrentLimit(35, 0);  // 15
        talon.configPeakCurrentDuration(100, 0);
        talon.enableCurrentLimit(true);

        talon.setInverted(false);
        
        talon.setNeutralMode(NeutralMode.Coast);

        talon.configNeutralDeadband(0.065);
    }

    for(WPI_TalonSRX talon : rightMotors) {
        talon.configOpenloopRamp(0, 0);
        talon.configContinuousCurrentLimit(35, 0); // 10
        talon.configPeakCurrentLimit(35, 0);  // 15
        talon.configPeakCurrentDuration(100, 0);
        talon.enableCurrentLimit(true);

        talon.setInverted(true);
        
        talon.setNeutralMode(NeutralMode.Coast);

        talon.configNeutralDeadband(0.065);
    }

    miniLeft.follow(frontLeft);
    miniRight.follow(frontRight);
    backLeft.follow(frontLeft);
    backRight.follow(frontRight);

    setDrive(0.0, 0.0);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new AbsoluteDrive());
  }

  public void driveControl() {
    setDrive(OI.getDriveSchemeLeft(), OI.getDriveSchemeRight());
  }

  private void setDrive(double left, double right) {
    frontLeft.set(ControlMode.PercentOutput, left);
    frontRight.set(ControlMode.PercentOutput, right);
    System.out.println(String.valueOf(left) + ", " + String.valueOf(right));
  }

  public void stopMoving() {
    setDrive(0.0, 0.0);
  }

}