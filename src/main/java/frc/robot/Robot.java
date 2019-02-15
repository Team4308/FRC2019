/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.auto.Auto;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.sensors.Camera;
import frc.robot.subsystems.sensors.Gyroscope;
import frc.robot.subsystems.sensors.UltrasonicSensor;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static Drivetrain drive;
  public static Elevator elevator;
  public static Intake intake;
  public static Gyroscope gyro;
  public static UltrasonicSensor ultrasonic;
  public static Camera camera;
  public static OI oi;
  public static Auto auto;
  public static Logger logger;
  public static PowerDistributionPanel pdp;
  public static Compressor compressor;

  /**
   * This function is run when the robot is first started up and should be
   * used for any initialization code.
   */
  @Override
  public void robotInit() {

		pdp = new PowerDistributionPanel(RobotMap.PDP_ID);
    LiveWindow.disableAllTelemetry();

    compressor = new Compressor(RobotMap.PCM_ID);
    
    drive = new Drivetrain();
    elevator = new Elevator();
    intake = new Intake();
    gyro = new Gyroscope();
    ultrasonic = new UltrasonicSensor();
    oi = new OI();
    auto = new Auto();
    logger = new Logger();

  }

  /**
   * This function is called every robot packet, no matter the mode. Use
   * this for items like diagnostics that you want ran during disabled,
   * autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    logger.log();
  }

  @Override
  public void autonomousInit() {
    auto.initAuto();
    
  }

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    auto.periodicAuto();
  }


  @Override
  public void teleopInit() {
    
  }

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
    
  }

}
