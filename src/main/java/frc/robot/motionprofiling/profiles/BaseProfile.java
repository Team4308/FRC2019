package frc.robot.motionprofiling.profiles;
import frc.robot.motionprofiling.GeneratedMotionProfile;
public class BaseProfile implements GeneratedMotionProfile {
    public int kNumPoints() {return kNumPoints;}
    public double kTimeStep() {return kTimeStep;}
    public boolean bForward() {return bForward;}
    public double[][] leftPoints() {return leftPoints;}
    public double[][] rightPoints() {return rightPoints;}

    private double kTimeStep;
    private int kNumPoints;
    private boolean bForward;
    // Position (rotations) Velocity (RPM) Duration (ms)
    private double[][] leftPoints;
    private double[][] rightPoints;

    public BaseProfile(double timeStep, int numPoints, boolean forward, double[][] leftPoints, double[][] rightPoints) {
        kTimeStep = timeStep;
        kNumPoints = numPoints;
        bForward = forward;
        this.leftPoints = leftPoints;
        this.rightPoints = rightPoints;
    }

}