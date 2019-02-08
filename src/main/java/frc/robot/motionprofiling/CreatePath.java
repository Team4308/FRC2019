/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.motionprofiling;

import frc.robot.RobotMap;
import frc.robot.motionprofiling.profiles.BaseProfile;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.Waypoint;
import jaci.pathfinder.Trajectory.Segment;
import jaci.pathfinder.modifiers.TankModifier;

public class CreatePath {

  private Trajectory leftTrajectory;
  private Trajectory rightTrajectory;

  private GeneratedMotionProfile profile;

  public Trajectory getLeftTrajectory() {return leftTrajectory;}
  public Trajectory getRightTrajectory() {return rightTrajectory;}

  public GeneratedMotionProfile getProfile() {return profile;}

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

    generateProfile();

  }

  private void generateProfile() {
    
    boolean forward = true;

    double[][] leftPoints = new double[leftTrajectory.length()][3];

    for (int i = 0; i < leftTrajectory.length(); i++) 
    {			
      Segment seg = leftTrajectory.get(i);

      leftPoints[i] = new double[] {seg.position*(12/RobotMap.Drive.MotionControl.kWheelDiameter*Math.PI),
                                    seg.velocity*(12/RobotMap.Drive.MotionControl.kWheelDiameter*Math.PI)*60,
                                    (int) seg.dt*1000};
    
    }
       
    double[][] rightPoints = new double[rightTrajectory.length()][3];

    for (int i = 0; i < rightTrajectory.length(); i++) 
    {			
      Segment seg = rightTrajectory.get(i);

      rightPoints[i] = new double[] {seg.position*(12/RobotMap.Drive.MotionControl.kWheelDiameter*Math.PI),
                                    seg.velocity*(12/RobotMap.Drive.MotionControl.kWheelDiameter*Math.PI)*60,
                                    (int) seg.dt*1000};
    
    }

    profile = new BaseProfile(RobotMap.Drive.Pathfinder.kTimeStep, leftTrajectory.length(), forward, leftPoints, rightPoints);
    
  }

}
