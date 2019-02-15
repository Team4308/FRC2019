/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.DriverStation.MatchType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ResetSensors;
import frc.robot.commands.SetElevatorPosition;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driveStick;
	public static Joystick controlStick;
	public static Joystick testingStick;

	// private JoystickButton A1;
	// private JoystickButton B1;
	// private JoystickButton X1;
	// private JoystickButton Y1;
	
	// private JoystickButton LB1;
	// private JoystickButton RB1;

	private JoystickButton Start1;
	// private JoystickButton Back1;
	
	private JoystickButton A2;
	private JoystickButton B2;
	private JoystickButton X2;
	private JoystickButton Y2;
	
	// private JoystickButton LB2;
	// private JoystickButton RB2;

	// private JoystickButton Start2;
	
	// private JoystickButton A3;
	// private JoystickButton B3;
	// private JoystickButton X3;
	// private JoystickButton Y3;
	
	// private JoystickButton LB3;
	// private JoystickButton RB3;

	// private JoystickButton Start3;
	
	public OI() {

		driveStick = new Joystick(RobotMap.Control.driveStick);
		controlStick = new Joystick(RobotMap.Control.controlStick);
		testingStick = new Joystick(RobotMap.Control.testingStick);

		if (!driveStick.getName().equals("") || DriverStation.getInstance().getMatchType() != MatchType.None) {
			// A1 = new JoystickButton(driveStick, RobotMap.Control.Standard.a);
			// B1 = new JoystickButton(driveStick, RobotMap.Control.Standard.b);
			// X1 = new JoystickButton(driveStick, RobotMap.Control.Standard.x);
			// Y1 = new JoystickButton(driveStick, RobotMap.Control.Standard.y);
			
			// LB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.leftBumper);
			// RB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.rightBumper);

			Start1 = new JoystickButton(driveStick, RobotMap.Control.Standard.start);
			// Back1 = new JoystickButton(driveStick, RobotMap.Control.Standard.back);

			// B1.whileHeld(new MoveFlag(0, false, -1));
			// X1.whileHeld(new MoveFlag(0, true, -1));
			// A1.whenPressed(new SetRobotState("cube drop"));
			// Y1.whenPressed(new SetRobotState("rave"));

			// LB1.whenPressed(new SetCurrentLimiting());
			// RB1.whenPressed(new SetCurrentLimiting());

			Start1.whenPressed(new ResetSensors());

			// Back1.whenPressed(new MPAuto(new TestMP()));
		}
	
		if (!controlStick.getName().equals("") || DriverStation.getInstance().getMatchType() != MatchType.None) {
			A2 = new JoystickButton(controlStick, RobotMap.Control.Standard.a);
			B2 = new JoystickButton(controlStick, RobotMap.Control.Standard.b);
			X2 = new JoystickButton(controlStick, RobotMap.Control.Standard.x);
			Y2 = new JoystickButton(controlStick, RobotMap.Control.Standard.y);
		
			// LB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.leftBumper);
			// RB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.rightBumper);

			// Start2 = new JoystickButton(controlStick, RobotMap.Control.Standard.start);	

			A2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.ground));
			X2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.rocketPort));
			Y2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.cargoShip));
			B2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.top));

			// LB2.whenPressed(new ToggleIntake(ToggleType.CLOSE));
			// RB2.whenPressed(new ToggleIntake(ToggleType.OPEN));
			
			// Start2.whenPressed(new ResetSensors());
		}
	
		if (!testingStick.getName().equals("") || DriverStation.getInstance().getMatchType() != MatchType.None) {
			// A3 = new JoystickButton(testingStick, RobotMap.Control.Standard.a);
			// B3 = new JoystickButton(testingStick, RobotMap.Control.Standard.b);
			// X3 = new JoystickButton(testingStick, RobotMap.Control.Standard.x);
			// Y3 = new JoystickButton(testingStick, RobotMap.Control.Standard.y);
		
			// LB3 = new JoystickButton(testingStick, RobotMap.Control.Standard.leftBumper);
			// RB3 = new JoystickButton(testingStick, RobotMap.Control.Standard.rightBumper);

			// Start3 = new JoystickButton(testingStick, RobotMap.Control.Standard.start);

			// A3.whenPressed(new Move(-60.0));
			// Y3.whenPressed(new Move(60.0));
			// X3.whenPressed(new RotateLong(-135.0));
			// B3.whenPressed(new RotateLong(135.0));

			// LB3.whenPressed(new Rotate(-45.0)); // Left
			// RB3.whenPressed(new Rotate(45.0)); // Right
			
			// Start3.whenPressed(new ResetSensors());
		}
		
	}
	
	// STICK CONTROLS
	// X -> RIGHT is POSITIVE, LEFT is NEGATIVE
	// Y -> UP is POSITIVE, DOWN is NEGATIVE (this includes the negative sign)
	
	// Tank Drive
//	(leftY, rightY); 
	
	// Arcade Drive - Left Stick
//	(leftY + leftX, leftY - leftX);
	
	// Arcade Drive - Left: Drive, Right: Steer
//	(leftY + rightX, leftY - rightX);
	
	public static double getDriveSchemeLeft() {
		
//		double leftX = driveStick.getRawAxis(RobotMap.Control.Standard.leftX);
		double leftY = driveStick.getRawAxis(RobotMap.Control.Standard.leftY);
		double rightX = driveStick.getRawAxis(RobotMap.Control.Standard.rightX);
//		double rightY = -driveStick.getRawAxis(RobotMap.Control.Standard.rightY);
		
		// if (leftY <= 0) {
		// 	leftY = -(leftY*leftY);
		// } else {
		// 	leftY = leftY*leftY;
		// }

		if (rightX <= 0) {
			rightX = -(rightX*rightX);
		} else {
			rightX = (rightX*rightX);
		}
		
		
		return normalized(leftY + rightX);
		
	}
	
	public static double getDriveSchemeRight() {
		
//		double leftX = driveStick.getRawAxis(RobotMap.Control.Standard.leftX);
		double leftY = driveStick.getRawAxis(RobotMap.Control.Standard.leftY);
		double rightX = driveStick.getRawAxis(RobotMap.Control.Standard.rightX);
//		double rightY = -driveStick.getRawAxis(RobotMap.Control.Standard.rightY);
		
		// if (leftY <= 0) {
		// 	leftY = -(leftY*leftY);
		// } else {
		// 	leftY = leftY*leftY;
		// }

		if (rightX <= 0) {
			rightX = -(rightX*rightX);
		} else {
			rightX = (rightX*rightX);
		}
		
		return normalized(leftY - rightX);
		
	}

	public static double getElevatorScheme() {

//		double leftX = controlStick.getRawAxis(RobotMap.Control.Standard.leftX);
// 		double leftY = controlStick.getRawAxis(RobotMap.Control.Standard.leftY);
// 		double rightX = controlStick.getRawAxis(RobotMap.Control.Standard.rightX);
		double rightY = -controlStick.getRawAxis(RobotMap.Control.Standard.rightY);

		return normalized(rightY);

	}
	
	private static double normalized(double val) {
		if (Math.abs(val) < RobotMap.Control.kInputDeadband) {
			return 0;
		}

		if (val > 1.0) {
			return 1.0;
		}
		else if (val < -1.0) {
			return -1.0;
		}
		else {
			return val;
		}
	}
  


}