/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.auto;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.motionprofiling.RunMotionProfile;
import frc.robot.motionprofiling.profiles.CargoFrontRight2PreStationRightMP;
import frc.robot.motionprofiling.profiles.PreStationRight2StationRightMP;

public class FR_RS extends CommandGroup {
  /**
   * Add your docs here.
   */
  public FR_RS() {
    addSequential(new RunMotionProfile(new CargoFrontRight2PreStationRightMP()));
    addSequential(new RunMotionProfile(new PreStationRight2StationRightMP()));
  }
}
