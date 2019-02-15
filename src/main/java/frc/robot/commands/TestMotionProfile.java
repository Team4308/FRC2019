/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.motionprofiling.RunMotionProfile;
import frc.robot.motionprofiling.profiles.TestMP;

public class TestMotionProfile extends RunMotionProfile {

  public TestMotionProfile() {
    super();
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    _profile = new TestMP();
    super.initialize();
  }

}
