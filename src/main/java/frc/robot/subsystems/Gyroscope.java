package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.subsystems.defaults.AbsoluteGyroscope;

public class Gyroscope extends Subsystem {

	private AHRS navx;
	private double drift;

	
	public Gyroscope() {
		navx = new AHRS(SPI.Port.kMXP);
		drift = 0;

		resetSensors();
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new AbsoluteGyroscope());
	}

	public void gyroControl() {
		drift += RobotMap.Sensors.kAngleDrift;
		navx.setAngleAdjustment(drift);
	}

	public double getAngle() {
		return navx.getAngle();
	}

	public void resetSensors() {
		navx.reset();
		drift = 0;
		navx.setAngleAdjustment(0);
	}

}
