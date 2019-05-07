/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.auto.FR_RS;
import frc.robot.commands.ActuateClaw;
import frc.robot.commands.ActuateClimber;
import frc.robot.commands.ActuatePusher;
import frc.robot.commands.BeginClimb;
import frc.robot.commands.EnableClimb;
import frc.robot.commands.GetLog;
import frc.robot.commands.ResetSensors;
import frc.robot.commands.SetArmPosition;
import frc.robot.commands.SetBallManipulatorPosition;
import frc.robot.commands.SetElevatorPosition;
import frc.robot.commands.ActuateClaw.ClawAction;
import frc.robot.commands.ActuateClimber.ClimberAction;
import frc.robot.commands.ActuatePusher.PusherAction;
import frc.robot.motionprofiling.RunMotionProfile;
import frc.robot.motionprofiling.profiles.*;
import frc.robot.motionprofiling.profiles.old.TestMP;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick driveStick;
	public static Joystick controlStick;

	private JoystickButton A1;
	private JoystickButton B1;
	private JoystickButton X1;
	private JoystickButton Y1;
	
	private JoystickButton LB1;
	private JoystickButton RB1;

	private JoystickButton Start1;
	private JoystickButton Back1;
	
	private JoystickButton A2;
	private JoystickButton B2;
	private JoystickButton X2;
	private JoystickButton Y2;
	
	private JoystickButton LB2;
	private JoystickButton RB2;

	private JoystickButton Start2;
	private JoystickButton Back2;
	
	public OI() {

		driveStick = new Joystick(RobotMap.Control.driveStick);
		controlStick = new Joystick(RobotMap.Control.controlStick);

		A1 = new JoystickButton(driveStick, RobotMap.Control.Standard.a);
		B1 = new JoystickButton(driveStick, RobotMap.Control.Standard.b);
		X1 = new JoystickButton(driveStick, RobotMap.Control.Standard.x);
		Y1 = new JoystickButton(driveStick, RobotMap.Control.Standard.y);
		
		LB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.leftBumper);
		RB1 = new JoystickButton(driveStick, RobotMap.Control.Standard.rightBumper);

		Start1 = new JoystickButton(driveStick, RobotMap.Control.Standard.start);
		Back1 = new JoystickButton(driveStick, RobotMap.Control.Standard.back);

		A1.whenPressed(new ActuateClaw(ClawAction.RELEASE));
		X1.whenPressed(new ActuateClaw(ClawAction.GRAB));
		Y1.whenPressed(new ActuatePusher(PusherAction.PUSH));
		B1.whenPressed(new ActuatePusher(PusherAction.PULL));

		LB1.whenPressed(new ActuateClimber(ClimberAction.PUSH));
		RB1.whenPressed(new ActuateClimber(ClimberAction.PULL));

		Start1.whenPressed(new BeginClimb());

		Back1.whenPressed(new ResetSensors());
	
		A2 = new JoystickButton(controlStick, RobotMap.Control.Standard.a);
		B2 = new JoystickButton(controlStick, RobotMap.Control.Standard.b);
		X2 = new JoystickButton(controlStick, RobotMap.Control.Standard.x);
		Y2 = new JoystickButton(controlStick, RobotMap.Control.Standard.y);
	
		LB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.leftBumper);
		RB2 = new JoystickButton(controlStick, RobotMap.Control.Standard.rightBumper);

		Start2 = new JoystickButton(controlStick, RobotMap.Control.Standard.start);
		Back2 = new JoystickButton(controlStick, RobotMap.Control.Standard.back);	

		// A2.whenPressed(new SetBallManipulatorPosition(RobotMap.Elevator.Position.ground, RobotMap.Arm.Position.up));
		// X2.whenPressed(new SetBallManipulatorPosition(RobotMap.Elevator.Position.ball, RobotMap.Arm.Position.down));
		// Y2.whenPressed(new SetBallManipulatorPosition(RobotMap.Elevator.Position.rocketPort, RobotMap.Arm.Position.up));
		// B2.whenPressed(new SetBallManipulatorPosition(RobotMap.Elevator.Position.cargoShip, RobotMap.Arm.Position.up));

		A2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.ground));
		X2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.ball));
		Y2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.rocketPort));
		B2.whenPressed(new SetElevatorPosition(RobotMap.Elevator.Position.cargoShip));

		LB2.whenPressed(new FR_RS());
		RB2.whenPressed(new FR_RS());
		
		Start2.whenPressed(new EnableClimb(false));

		Back2.whenPressed(new ResetSensors());
		
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
		double leftY = -driveStick.getRawAxis(RobotMap.Control.Standard.leftY);
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
		double leftY = -driveStick.getRawAxis(RobotMap.Control.Standard.leftY);
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

		double output = rightY + RobotMap.Elevator.Speed.kOffsetInput;

		if (Robot.climber.getClimbEnabled()) {
			output += driveStick.getRawAxis(RobotMap.Control.Standard.rightTrigger);
			output -= RobotMap.Elevator.Speed.kOffsetInput;
		}

		return normalized(output);

	}

	public static double getArmScheme() {

		// double leftX = controlStick.getRawAxis(RobotMap.Control.Standard.leftX);
		double leftY = controlStick.getRawAxis(RobotMap.Control.Standard.leftY);
		// double rightX = controlStick.getRawAxis(RobotMap.Control.Standard.rightX);
		// double rightY = controlStick.getRawAxis(RobotMap.Control.Standard.rightY);

		return normalized(leftY);

	}

	public static double getIntakeScheme() {

//		double leftX = controlStick.getRawAxis(RobotMap.Control.Standard.leftX);
//		double leftY = controlStick.getRawAxis(RobotMap.Control.Standard.leftY);
// 		double rightX = controlStick.getRawAxis(RobotMap.Control.Standard.rightX);
// 		double rightY = controlStick.getRawAxis(RobotMap.Control.Standard.rightY);

		double leftTrigger = controlStick.getRawAxis(RobotMap.Control.Standard.leftTrigger);  // Push out
		double rightTrigger = controlStick.getRawAxis(RobotMap.Control.Standard.rightTrigger);  // Pull in

		double output = leftTrigger - rightTrigger;

		if (Robot.climber.getClimbEnabled()) {
			output += -driveStick.getRawAxis(RobotMap.Control.Standard.leftTrigger);
		}

		return normalized(output);

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