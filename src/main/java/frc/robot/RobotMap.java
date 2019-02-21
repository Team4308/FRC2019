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

		public static final int frontLeft = 0;
		public static final int backLeft = 4;
		public static final int topLeft = 1;
		public static final int frontRight = 5;
		public static final int backRight = 6;
		public static final int topRight = 7;

		public static class Speed {

			public static final double kDeadband = 0.01;
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

			public static final double kWheelDiameter = 8.4; // inches
			public static final double kInchesPerRotation = 26.5;
			public static final double kSensorUnitsPerRotation = 512; // Practice
			public static final double kEncoderInchesPerCount = kInchesPerRotation/kSensorUnitsPerRotation;

			public static final int kBaseTrajectoryPeriod = 0; // Base to add
			public static final int kTrajectoryPeriod = 10; // Motion profile traj period on init
			public static final int kTimeoutMs = 30;

			public static final double kLeftFeedForward = 2.4; // (0.24) 1023/422 -> 422u/100ms max velocity
			public static final double kLeftP = 2.4;
			public static final double kLeftI = 0.0;
			public static final double kLeftD = 24.0;
			public static final double kRightFeedForward = 2.4; // 1023/404 -> 404u/100ms max velocity
			public static final double kRightP = 2.4;
			public static final double kRightI = 0.0;
			public static final double kRightD = 24.0;

			public static final double kExtraTime = 4.0;  // 0.75
			
		}

		public static class Pathfinder {

			public static final double kWheelDiameter = 8.4; // inches
			public static final double kTimeStep = 0.010; // 10 ms
			public static final double kMaxVelocity = 8; // ft/s
			public static final double kMaxAcceleration = 10; // ft/s/s
			public static final double kMaxJerk = 30; // ft/s/s/s
			public static final double kWheelBase = 2.4; // ft

		}

	}

	public static class Elevator {

		public static final int left = 2;
		public static final int right = 9;

		public static class Speed {

			public static final double kDeadband = 0.01;
			public static final double kBrake = -0.06;
			public static final double kOffsetInput = -0.09;
			public static final double kSpeedNormal = 1.0;
			public static final double kSpeedSlow = 0.42;

		}

		public static class Position {

			public static final double ground = 0.0;
			public static final double depot = 1.25;
			public static final double cargoShip = 29.0;
			public static final double rocketPort = 19.5;

		}

		public static class Power {

			public static final int kOpenloopRamp = 0;
			public static final int kContinuousCurrentLimit = 15;
			public static final int kPeakCurrentLimit = 15;
			public static final int kPeakDuration = 100; 

		}

		public static class MotionControl {

			public static final double kSprocketTeeth = 16; // teeth
			public static final double kChainPitch = 0.25; // inches
			public static final double kSensorUnitsPerRotation = 4096; 
			public static final double kEncoderInchesPerCount = kSprocketTeeth * kChainPitch/kSensorUnitsPerRotation;

			public static final int kBaseTrajectoryPeriod = 0; // Base to add
			public static final int kTrajectoryPeriod = 10; // Motion profile traj period on init
			public static final int kTimeoutMs = 30;

			public static final double kFeedForward = 0.5115;
			public static final double kP = 1.0;
			public static final double kI = 0.0;
			public static final double kD = 0.4;

			public static final int kCruiseVelocity = 2000;
			public static final int kAcceleration = 4000;
			
		}

	}

	public static class Intake {

		public static final int motor = 3;

		public static class Speed {

			public static final double kDeadband = 0.01;
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
			public static final double kAngleDrift = 0.0001;
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

			public static final int frontLeft = 1;
			public static final int backLeft = 2;
			public static final int topLeft = 0;
			public static final int frontRight = 14;
			public static final int backRight = 13;
			public static final int topRight = 15;

		}

		public static class Elevator {

			public static final int leftElevator = 12;
			public static final int rightElevator = 3;

		}

		public static class Intake {

			public static final int intakeMotor = 11;

		}

	}

}