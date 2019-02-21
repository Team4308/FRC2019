package frc.robot.subsystems.sensors;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import frc.robot.RobotMap;

public class Gyroscope {

	private AHRS navx;
	private double drift;

	public Gyroscope() {
		navx = new AHRS(SPI.Port.kMXP);
		drift = 0;

		resetSensors();
	}

	public void gyroControl() {
		drift += RobotMap.Sensors.Gyro.kAngleDrift;
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
