/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.motionprofiling.CreatePath;
import frc.robot.motionprofiling.RunMotionProfile;

public class AlignHatch extends RunMotionProfile {

  public AlignHatch() {
    super();
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

    double angle = Robot.gyro.getAngle();
    angle %= 360;
    if (angle < 0)
      angle += 360;
    angle -= 180;

    // Figure out the location of the hatch
    // int hatchPos = 0;

    // Forwards from robot
    if (angle > -45 && angle <= 45) {
      // hatchPos = 1;
    }
    // Left from robot
    else if (angle > -135 && angle <= -45) {
      // hatchPos = 0;
      angle += 90;
    }
    // Right from robot
    else if (angle > 45 && angle <= 135) {
      // hatchPos = 2;
      angle -= 90;
    }
    // Backwards?? from robot
    else {
      // hatchPos = 3;
      if (angle <= -135) {
        angle += 90;
      }
      if (angle > 135) {
        angle -= 90;
      }
    }

    double distanceError = Robot.camera.getTapeDistance();
    double angleError = -angle;

    if (distanceError <= 0)
    {
      setTimeout(0.0);
      return;
    }

    CreatePath path = new CreatePath(distanceError, angleError, false);

    _profile = path.getProfile();

    super.initialize();

  }

}
