/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class SetBallManipulatorPosition extends CommandGroup {
  
  public SetBallManipulatorPosition(double targetElevatorPosInInches, double targetArmPosInDegrees) {

    addParallel(new SetElevatorPosition(targetElevatorPosInInches));
    addParallel(new SetArmPosition(targetArmPosInDegrees));

  }
}
