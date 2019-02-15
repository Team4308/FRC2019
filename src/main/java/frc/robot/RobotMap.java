/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int PCM_ID = 1;
	public static final int PDP_ID = 0;

	public static final double kAutonomousTime = 15.0;
	public static final double kTeleoperatedTime = 120.0;

	public static class Control {

		public static final double kInputDeadband = 0.065;

		public static final int driveStick = 0;
		public static final int controlStick = 1;
		public static final int testingStick = 2;

		public static class Standard {

			public static final int leftX = 0;
			public static final int leftY = 1;
			public static final int leftTrigger = 2;
			public static final int rightTrigger = 3;
			public static final int rightX = 4;
			public static final int rightY = 5;
			public static final int a = 1;
			public static final int b = 2;
			public static final int x = 3;
			public static final int y = 4;
			public static final int leftBumper = 5;
			public static final int rightBumper = 6;
			public static final int back = 7;
			public static final int start = 8;
			public static final int leftAnalogClick = 9;
			public static final int rightAnalogClick = 10;

		}

	}

	public static class Drive {

		public static final int frontLeft = 5;
		public static final int backLeft = 7;
		public static final int topLeft = 6;
		public static final int frontRight = 0;
		public static final int backRight = 1;
		public static final int topRight = 4;

		public static class Speed {

			public static final double kDeadband = 0.05;
			public static final double kSpeedNormal = 1.0;
			public static final double kSpeedSlow = 0.42;

		}

		public static class Power {

			public static final int kOpenloopRamp = 0;
			public static final int kContinuousCurrentLimit = 35;
			public static final int kPeakCurrentLimit = 35;
			public static final int kPeakDuration = 100; 

		}

		public static class MotionControl {

			public static final double kWheelDiameter = 8; // inches
			public static final double kSensorUnitsPerRotation = 1024/2; // Practice
			public static final double kEncoderCountsToInches = Math.PI * kWheelDiameter/kSensorUnitsPerRotation;

			public static final int kBaseTrajectoryPeriod = 0; // Base to add
			public static final int kTrajectoryPeriod = 10; // Motion profile traj period on init
			public static final int kTimeoutMs = 30;

			public static final double kLeftFeedForward = 0.23986932;
			public static final double kLeftP = 2.0;
			public static final double kLeftI = 0.0;
			public static final double kLeftD = 20.0;
			public static final double kRightFeedForward = 0.2356057117;
			public static final double kRightP = 2.0;
			public static final double kRightI = 0.0;
			public static final double kRightD = 20.0;
			
		}

		public static class Pathfinder {

			public static final double kTimeStep = 0.010; // 10 ms
			public static final double kMaxVelocity = 4; // 4 ft/s
			public static final double kMaxAcceleration = 6; // 6 ft/s/s
			public static final double kMaxJerk = 60; // 60 ft/s/s/s
			public static final double kWheelBase = 2; // 2 ft

		}

	}

	public static class Elevator {

		public static final int left = 99999; // TODO
		public static final int right = 99999; // TODO

		public static class Speed {

			public static final double kDeadband = 0.05;
			public static final double kSpeedNormal = 1.0;
			public static final double kSpeedSlow = 0.42;

		}

		public static class Position {

			public static final double ground = 0.0;
			public static final double cargoShip = 29.0;
			public static final double rocketPort = 20.0;
			public static final double top = 31.0;

		}

		public static class Power {

			public static final int kOpenloopRamp = 0;
			public static final int kContinuousCurrentLimit = 35;
			public static final int kPeakCurrentLimit = 35;
			public static final int kPeakDuration = 100; 

		}

		public static class MotionControl {

			public static final double kSprocketTeeth = 16; // teeth
			public static final double kChainPitch = 1/4; // inches
			public static final double kSensorUnitsPerRotation = 4096; 
			public static final double kEncoderCountsToInches = kSprocketTeeth * kChainPitch/kSensorUnitsPerRotation;

			public static final int kBaseTrajectoryPeriod = 0; // Base to add
			public static final int kTrajectoryPeriod = 10; // Motion profile traj period on init
			public static final int kTimeoutMs = 30;

			public static final double kFeedForward = 0.23986932;
			public static final double kP = 0.2;
			public static final double kI = 0.0;
			public static final double kD = 0.0;

			public static final int kCruiseVelocity = 8192;
			public static final int kAcceleration = 1024;
			
		}

	}

	public static class Intake {

		public static final int motor = 99999;

		public static class Speed {

			public static final double kDeadband = 0.05;
			public static final double kSpeedNormal = 1.0;
			public static final double kSpeedSlow = 0.42;

		}

		public static class Power {

			public static final int kOpenloopRamp = 0;
			public static final int kContinuousCurrentLimit = 35;
			public static final int kPeakCurrentLimit = 35;
			public static final int kPeakDuration = 100; 

		}

	}

	public static class Sensors {

		public static class Gyro {
			public static final double kAngleDrift = 0.00001;
		}

		public static class UltrasonicSensor {
			public static final int ultrasonicChannel = 1;
			public static final double kUltrasonicVoltageToInches = 102.4/25.4; // 102.4 mm per volt, 25.4 mm per inch
		}

		public static class Camera {
			public static final String cameraTableKey = "PiVision";
			public static final String tapeYawKey = "tapeYaw";
			public static final String tapePitchKey = "tapePitch";
			public static final String tapeDistanceKey = "tapeDistance";
		}

	}

	public static class Power {

		public static class Drive {

			public static final int frontLeft = 0;
			public static final int backLeft = 2;
			public static final int topLeft = 4;
			public static final int frontRight = 1;
			public static final int backRight = 3;
			public static final int topRight = 5;

		}

		public static class Elevator {

			public static final int leftElevator = 6;
			public static final int rightElevator = 7;

		}

		public static class Intake {

			public static final int intakeMotor = 8;

		}

	}

}