/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.subsystems.HatchGrabber;
import frc.robot.auto.Auto;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.sensors.Camera;
import frc.robot.subsystems.sensors.Gyroscope;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  public static PowerDistributionPanel pdp;
  public static Compressor compressor;

  public static Drivetrain drive;
  public static Elevator elevator;
  public static Intake intake;
  public static Arm arm;
  public static HatchGrabber hatchGrabber;
  public static Climber climber;

  public static Gyroscope gyro;
  // public static UltrasonicSensor ultrasonic;
  public static Camera camera;

  public static OI oi;
  public static Logger logger;
  public static Auto auto;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {

		pdp = new PowerDistributionPanel(RobotMap.PDP_ID);
    LiveWindow.disableAllTelemetry();

    compressor = new Compressor(RobotMap.PCM_ID);
    compressor.setClosedLoopControl(true);

    drive = new Drivetrain();
    elevator = new Elevator();
    intake = new Intake();
    arm = new Arm();
    hatchGrabber = new HatchGrabber();
    climber = new Climber();

    gyro = new Gyroscope();
    // ultrasonic = new UltrasonicSensor();
    camera = new Camera();

    oi = new OI();
    logger = new Logger();
    auto = new Auto();

    new Thread(() -> {
      UsbCamera camera = CameraServer.getInstance().startAutomaticCapture();
      camera.setResolution(320, 180); 
      
      CvSink cvSink = CameraServer.getInstance().getVideo();
      CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 320, 180);
      
      Mat source = new Mat();
      Mat output = new Mat();
      
      while(!Thread.interrupted()) {
        if (CameraServer.getInstance() != null) {
          cvSink.grabFrame(source);
          if (!source.empty()) {
            Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
            outputStream.putFrame(output);
          }
        }
      }
    }).start();

    new Thread(() -> {
      while(!Thread.interrupted()) {
        logger.log();
      }
    }).start();

  }

  /*
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override 
  public void disabledInit() {
    drive.setDrive(0.0, 0.0);
  }

  @Override
  public void robotPeriodic() {
    // gyro.gyroControl();
  }

  @Override
  public void autonomousInit() {
    
    // auto.initAuto();
    
  }

  /*
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    drive.driveControl();
    elevator.elevatorControl();
    intake.intakeControl();
    arm.armControl();

    Scheduler.getInstance().run();
  }


  @Override
  public void teleopInit() {
    
  }

  /*
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    drive.driveControl();
    elevator.elevatorControl();
    intake.intakeControl();
    arm.armControl();

    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    
    drive.driveControl();
    elevator.elevatorControl();
    intake.intakeControl();
    arm.armControl();

    Scheduler.getInstance().run();
  }

}
