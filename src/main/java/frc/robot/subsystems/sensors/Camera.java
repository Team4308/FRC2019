/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems.sensors;

// import edu.wpi.first.cameraserver.CameraServer;

// import org.opencv.core.Mat;
// import org.opencv.imgproc.Imgproc;

// import edu.wpi.cscore.CvSink;
// import edu.wpi.cscore.CvSource;
// import edu.wpi.cscore.UsbCamera;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Camera {
  
  private NetworkTable table;

  public Camera() {

    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    table = inst.getTable(RobotMap.Sensors.Camera.cameraTableKey);

  }

  public double getTapeYaw() {
    return table.getEntry(RobotMap.Sensors.Camera.tapeYawKey).getDouble(9999);
  }

  public double getTapeDistance() {
    return table.getEntry(RobotMap.Sensors.Camera.tapeDistanceKey).getDouble(-1000);
  }

  public double getTapePitch() {
    return table.getEntry(RobotMap.Sensors.Camera.tapePitchKey).getDouble(9999);
  }

}
