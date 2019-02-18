/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ResetSensors;
import frc.robot.commands.SetElevatorPosition;
import frc.robot.motionprofiling.RunMotionProfile;
import frc.robot.motionprofiling.profiles.Forward2MP;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driveStick;
	public static Joystick controlStick;
	public static Joystick testingStick;

	private JoystickButton A1;
	private JoystickButton B1;
	private JoystickButton X1;
	private JoystickButton Y1;
	
	// private JoystickButton LB1;
	// private JoystickButton RB1;

	private JoystickButton Start1;
	private JoystickButton Back1;
	
	private JoystickButton A2;
	private JoystickButton B2;
	private JoystickButton X2;
	private JoystickButton Y2;
	
	// private JoystickButton LB2;
	// private JoystickButton RB2;

	private JoystickButton Start2;
	
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

		A1 = new JoystickButton(driveStick, RobotMap.Control.Standard.a);
		B1 = new JoystickButton(driveStick, RobotMap.Control.Standard.b);
		X1 = new JoystickButton(driveStick, RobotMap.Control.Standard.x);
		Y1 = new JoystickButton(driveStick, RobotMap.Control.Standard.y);
		
		// LB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.leftBumper);
		// RB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.rightBumper);

		Start1 = new JoystickButton(driveStick, RobotMap.Control.Standard.start);
		Back1 = new JoystickButton(driveStick, RobotMap.Control.Standard.back);

		A1.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.ground));
		X1.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.depot));
		Y1.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.rocketPort));
		B1.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.cargoShip));

		// LB1.whenPressed(new SetCurrentLimiting());
		// RB1.whenPressed(new SetCurrentLimiting());

		Start1.whenPressed(new ResetSensors());

		Back1.whenPressed(new RunMotionProfile(new Forward2MP()));
	
		A2 = new JoystickButton(controlStick, RobotMap.Control.Standard.a);
		B2 = new JoystickButton(controlStick, RobotMap.Control.Standard.b);
		X2 = new JoystickButton(controlStick, RobotMap.Control.Standard.x);
		Y2 = new JoystickButton(controlStick, RobotMap.Control.Standard.y);
	
		// LB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.leftBumper);
		// RB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.rightBumper);

		Start2 = new JoystickButton(controlStick, RobotMap.Control.Standard.start);	

		A2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.ground));
		X2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.depot));
		Y2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.rocketPort));
		B2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.cargoShip));

		// LB2.whenPressed(new ToggleIntake(ToggleType.CLOSE));
		// RB2.whenPressed(new ToggleIntake(ToggleType.OPEN));
		
		Start2.whenPressed(new ResetSensors());
	
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
//		double rightY = driveStick.getRawAxis(RobotMap.Control.Standard.rightY);
		
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
//		double rightY = driveStick.getRawAxis(RobotMap.Control.Standard.rightY);
		
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
		double rightY = controlStick.getRawAxis(RobotMap.Control.Standard.rightY);

		rightY += RobotMap.Elevator.Speed.kOffsetInput;

		return normalized(rightY);

	}

	public static double getIntakeScheme() {

//		double leftX = controlStick.getRawAxis(RobotMap.Control.Standard.leftX);
		double leftY = controlStick.getRawAxis(RobotMap.Control.Standard.leftY);
// 		double rightX = controlStick.getRawAxis(RobotMap.Control.Standard.rightX);
// 		double rightY = controlStick.getRawAxis(RobotMap.Control.Standard.rightY);

		double leftTrigger = driveStick.getRawAxis(RobotMap.Control.Standard.leftTrigger);
		double rightTrigger = driveStick.getRawAxis(RobotMap.Control.Standard.rightTrigger);

		return normalized(leftY + leftTrigger - rightTrigger);

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