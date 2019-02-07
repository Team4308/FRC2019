package frc.robot.motionprofiling;
public interface GeneratedMotionProfile {
    public int kNumPoints();
    public double kTimeStep();
    public double[][] leftPoints();
    public double[][] rightPoints();
}