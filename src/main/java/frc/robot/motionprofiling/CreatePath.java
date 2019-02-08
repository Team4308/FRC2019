/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.motionprofiling;

import frc.robot.RobotMap;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.modifiers.TankModifier;

public class CreatePath {

  private Trajectory leftTrajectory;
  private Trajectory rightTrajectory;

  private GeneratedMotionProfile leftProfile;
  private GeneratedMotionProfile rightProfile;

  public Trajectory getLeftTrajectory() {return leftTrajectory;}
  public Trajectory getRightTrajectory() {return rightTrajectory;}

  public GeneratedMotionProfile getLeftProfile() {return leftProfile;}
  public GeneratedMotionProfile getRightProfile() {return rightProfile;}

  public CreatePath(double dist, double angle) {

    Waypoint[] points = new Waypoint[] {
      new Waypoint(0, 0, 0),
      new Waypoint(dist, 0, Pathfinder.d2r(angle))
    };

    generatePath(points);

  }

  private void generatePath(Waypoint[] points) {

    Trajectory.Config config = new Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, 
                                                      Trajectory.Config.SAMPLES_HIGH, 
                                                      RobotMap.Drive.Pathfinder.kTimeStep, 
                                                      RobotMap.Drive.Pathfinder.kMaxVelocity, 
                                                      RobotMap.Drive.Pathfinder.kMaxAcceleration, 
                                                      RobotMap.Drive.Pathfinder.kMaxJerk );

    Trajectory trajectory = Pathfinder.generate(points, config);

    TankModifier modifier = new TankModifier(trajectory).modify(RobotMap.Drive.Pathfinder.kWheelBase);

    leftTrajectory = modifier.getLeftTrajectory();
    rightTrajectory = modifier.getRightTrajectory();
    
  }


}
