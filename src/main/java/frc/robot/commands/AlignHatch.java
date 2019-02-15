/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.motionprofiling.CreatePath;
import frc.robot.motionprofiling.RunMotionProfile;

public class AlignHatch extends RunMotionProfile {

  public AlignHatch() {
    super();
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    double distanceError = 0.0; // TODO
    double angleError = 0.0; // TODO

    CreatePath path = new CreatePath(distanceError, angleError);

    _profile = path.getProfile();

    super.initialize();

  }

}
