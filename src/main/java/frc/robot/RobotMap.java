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

	public static final double encoderPulseDistance = 0.042;

	public static final int PCM_ID = 1;
	public static final int PDP_ID = 0;

	public static final double kAutonomousTime = 15.0;
	public static final double kTeleoperatedTime = 120.0;

	public static class Control {

		public static final int driveStick = 0;

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

			public static final double kDeadband = 0.065;
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
			public static final double kEncoderCountsToInches = Math.PI * kWheelDiameter/1024;
			public static final double kLeftFeedForward = 0.23986932;
			public static final double kLeftP = 2.0;
			public static final double kLeftI = 0.0;
			public static final double kLeftD = 20.0;
			public static final double kRightFeedForward = 0.2356057117;
			public static final double kRightP = 2.0;
			public static final double kRightI = 0.0;
			public static final double kRightD = 20.0;
			public static final int kTrajectoryPeriod = 10;
			public static final int kTimeoutMs = 30;
			
		}

	}

	public static class Sensors {

		public static final double kAngleDrift = 0.00001;

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

		// public static final int primaryAmpLimit = 40;
		// public static final int secondaryAmpLimit = 30;
		// public static final int breakerAmpLimit = 120;
		// public static final int pneumaticsAmpLimit = 17;

		// public static final double warningTemp = 60.0;
		// public static final double dangerTemp = 85.0;
		// public static final double cautionThreshold = 0.9;
		// public static final double warningThreshold = 0.8;

	}

}