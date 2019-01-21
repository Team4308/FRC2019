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
		public static final int miniLeft = 6;
		public static final int frontRight = 0;
		public static final int backRight = 1;
		public static final int miniRight = 4;

		public static class Speed {

			public static final double normal = 1.0;
			public static final double slow = 0.42;

		}

	}



	public static class Camera {

		public static final int videoWidth = 640;
		public static final int videoHeight = 480;

		public static final String usbName = "cam0";
		public static final String axisName = "axis-camera.local";

	}


	public static class Power {

		public static final int primaryAmpLimit = 40;
		public static final int secondaryAmpLimit = 30;
		public static final int breakerAmpLimit = 120;
		public static final int pneumaticsAmpLimit = 17;

		public enum BatteryLevel {

			NOMINAL(12, 0.5), LOW(10.5, 1.0), DISCHARGED(8.0, 1.5);

			public final double center;
			public final double range;

			BatteryLevel(double center, double range) {

				this.center = center;
				this.range = range;

			}

			public static BatteryLevel level(double level) {

				for (int i = values().length - 1; i >= 0; i--) {

					BatteryLevel l = values()[i];

					// if the provided value is within the range of the level
					// enum
					if (level >= l.center - l.range) {
						return l;
					}

				}

				return BatteryLevel.DISCHARGED;

				// if (level > NOMINAL.center - NOMINAL.range) {
				// return BatteryLevel.NOMINAL;
				// } else if (level > LOW.center - LOW.range) {
				// return BatteryLevel.LOW;
				// } else {
				// return BatteryLevel.DISCHARGED;
				// }

			}

		}

		public static final double warningTemp = 60.0;
		public static final double dangerTemp = 85.0;
		public static final double cautionThreshold = 0.9;
		public static final double warningThreshold = 0.8;

	}

}