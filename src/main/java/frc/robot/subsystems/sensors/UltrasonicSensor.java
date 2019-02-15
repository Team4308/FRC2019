/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.sensors;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class UltrasonicSensor extends Subsystem {

  private AnalogInput ultrasensor;

  public UltrasonicSensor() {
    ultrasensor = new AnalogInput(RobotMap.Sensors.UltrasonicSensor.ultrasonicChannel);
  }

  public double getDistance() {
    return ultrasensor.getVoltage()*RobotMap.Sensors.UltrasonicSensor.kUltrasonicVoltageToInches;
  }

  @Override
  public void initDefaultCommand() {
    // setDefaultCommand(new ____);
  }

}
