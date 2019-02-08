package frc.robot.motionprofiling.profiles;
import frc.robot.motionprofiling.GeneratedMotionProfile;
public class LoopMP implements GeneratedMotionProfile {
    public int kNumPoints() {return kNumPoints;}
    public double kTimeStep() {return kTimeStep;}
    public boolean bForward() {return bForward;}
    public double[][] leftPoints() {return leftPoints;}
    public double[][] rightPoints() {return rightPoints;}
    private static final double kTimeStep = 0.010;
    private static final int kNumPoints = 664;
    private static final boolean bForward = true;
    // private static final int kNumPoints_R = 664;
    // Position (rotations) Velocity (RPM) Duration (ms)
    private static final double[][] leftPoints = new double[][]{
        {0.000019, 0.228043, 10}, {0.000063, 0.264909, 10}, {0.000206, 0.855142, 10}, {0.000459, 1.520195, 10}, {0.000855, 2.375160, 10}, {0.001425, 3.419918, 10}, {0.002201, 4.654297, 10}, {0.003214, 6.078053, 10}, {0.004495, 7.690863, 10}, {0.006077, 9.492311, 10}, {0.007975, 11.387000, 10}, {0.010189, 13.279619, 10}, {0.012717, 15.169811, 10}, {0.015560, 17.057217, 10}, {0.018717, 18.941471, 10}, {0.022187, 20.822200, 10}, {0.025970, 22.699025, 10}, {0.030065, 24.571558, 10}, {0.034472, 26.439404, 10}, {0.039189, 28.302158, 10}, {0.044216, 30.159403, 10}, {0.049551, 32.010711, 10}, {0.055193, 33.855645, 10}, {0.061142, 35.693751, 10}, {0.067396, 37.524563, 10}, {0.073954, 39.347600, 10}, {0.080815, 41.162363, 10}, {0.087976, 42.968338, 10}, {0.095437, 44.764992, 10}, {0.103196, 46.551772, 10}, {0.111250, 48.328105, 10}, {0.119599, 50.093395, 10}, {0.128240, 51.847025, 10}, {0.137172, 53.588352, 10}, {0.146391, 55.316707, 10}, {0.155896, 57.031394, 10}, {0.165685, 58.731690, 10}, {0.175754, 60.416839, 10}, {0.186102, 62.086057, 10}, {0.196725, 63.738524, 10}, {0.207621, 65.373388, 10}, {0.218786, 66.989759, 10}, {0.230217, 68.586713, 10}, {0.241911, 70.163284, 10}, {0.253864, 71.718468, 10}, {0.266072, 73.251221, 10}, {0.278532, 74.760455, 10}, {0.291240, 76.245039, 10}, {0.304191, 77.703801, 10}, {0.317380, 79.135523, 10}, {0.330803, 80.538944, 10}, {0.344455, 81.912760, 10}, {0.358331, 83.255624, 10}, {0.372425, 84.566147, 10}, {0.386733, 85.842905, 10}, {0.401247, 87.084436, 10}, {0.415962, 88.289247, 10}, {0.430871, 89.455822, 10}, {0.445968, 90.582625, 10}, {0.461246, 91.668110, 10}, {0.476698, 92.710733, 10}, {0.492316, 93.708964, 10}, {0.508093, 94.661302, 10}, {0.524021, 95.566293, 10}, {0.540091, 96.422555, 10}, {0.556296, 97.228799, 10}, {0.572626, 97.983863, 10}, {0.589061, 98.608775, 10}, {0.605566, 99.028385, 10}, {0.622107, 99.248174, 10}, {0.638653, 99.274223, 10}, {0.655172, 99.113202, 10}, {0.671634, 98.772349, 10}, {0.688010, 98.259433, 10}, {0.704274, 97.582700, 10}, {0.720399, 96.750811, 10}, {0.736362, 95.772757, 10}, {0.752150, 94.728068, 10}, {0.767765, 93.692554, 10}, {0.783210, 92.669583, 10}, {0.798487, 91.662715, 10}, {0.813600, 90.675685, 10}, {0.828552, 89.712387, 10}, {0.843348, 88.776845, 10}, {0.857993, 87.873185, 10}, {0.872494, 87.005602, 10}, {0.886857, 86.178322, 10}, {0.901090, 85.395558, 10}, {0.915200, 84.661465, 10}, {0.929197, 83.980091, 10}, {0.943089, 83.355327, 10}, {0.956888, 82.790857, 10}, {0.970603, 82.290102, 10}, {0.984246, 81.856176, 10}, {0.997828, 81.491838, 10}, {1.011361, 81.199444, 10}, {1.024858, 80.980916, 10}, {1.038331, 80.837705, 10}, {1.051792, 80.770771, 10}, {1.065256, 80.780565, 10}, {1.078734, 80.867021, 10}, {1.092239, 81.029557, 10}, {1.105783, 81.267086, 10}, {1.119379, 81.578034, 10}, {1.133039, 81.960365, 10}, {1.146775, 82.411616, 10}, {1.160596, 82.928934, 10}, {1.174514, 83.509123, 10}, {1.188539, 84.148687, 10}, {1.202680, 84.843887, 10}, {1.216945, 85.590786, 10}, {1.231343, 86.385304, 10}, {1.245880, 87.223267, 10}, {1.260563, 88.100454, 10}, {1.275399, 89.012644, 10}, {1.290391, 89.955656, 10}, {1.305545, 90.925386, 10}, {1.320865, 91.917841, 10}, {1.336353, 92.929165, 10}, {1.352013, 93.955667, 10}, {1.367845, 94.993833, 10}, {1.383852, 96.040348, 10}, {1.400034, 97.092102, 10}, {1.416391, 98.146196, 10}, {1.432925, 99.199950, 10}, {1.449633, 100.250899, 10}, {1.466516, 101.296791, 10}, {1.483572, 102.335585, 10}, {1.500799, 103.365445, 10}, {1.518197, 104.384728, 10}, {1.535762, 105.391978, 10}, {1.553493, 106.385918, 10}, {1.571387, 107.365434, 10}, {1.589442, 108.329570, 10}, {1.607655, 109.277516, 10}, {1.626023, 110.208594, 10}, {1.644544, 111.122251, 10}, {1.663213, 112.018046, 10}, {1.682029, 112.895641, 10}, {1.700989, 113.754792, 10}, {1.720088, 114.595340, 10}, {1.739324, 115.417202, 10}, {1.758694, 116.220359, 10}, {1.778195, 117.004857, 10}, {1.797823, 117.770793, 10}, {1.817576, 118.518310, 10}, {1.837451, 119.247593, 10}, {1.857444, 119.958862, 10}, {1.877553, 120.652367, 10}, {1.897774, 121.328384, 10}, {1.918105, 121.987210, 10}, {1.938544, 122.629162, 10}, {1.959086, 123.254570, 10}, {1.979730, 123.863775, 10}, {2.000473, 124.457130, 10}, {2.021312, 125.034992, 10}, {2.042245, 125.597723, 10}, {2.063269, 126.145688, 10}, {2.084382, 126.679253, 10}, {2.105545, 126.974460, 10}, {2.126701, 126.934664, 10}, {2.147769, 126.407997, 10}, {2.168746, 125.867109, 10}, {2.189632, 125.311633, 10}, {2.210422, 124.741205, 10}, {2.231115, 124.155460, 10}, {2.251707, 123.554039, 10}, {2.272196, 122.936586, 10}, {2.292580, 122.302754, 10}, {2.312855, 121.652208, 10}, {2.333020, 120.984623, 10}, {2.353070, 120.299694, 10}, {2.373002, 119.597132, 10}, {2.392815, 118.876674, 10}, {2.412505, 118.138086, 10}, {2.432068, 117.381164, 10}, {2.451503, 116.605745, 10}, {2.470805, 115.811707, 10}, {2.489971, 114.998981, 10}, {2.508999, 114.167551, 10}, {2.527885, 113.317468, 10}, {2.546627, 112.448854, 10}, {2.565220, 111.561910, 10}, {2.583663, 110.656927, 10}, {2.601952, 109.734293, 10}, {2.620085, 108.794507, 10}, {2.638058, 107.838183, 10}, {2.655869, 106.866066, 10}, {2.673515, 105.879041, 10}, {2.690995, 104.878141, 10}, {2.708306, 103.864563, 10}, {2.725446, 102.839674, 10}, {2.742413, 101.805025, 10}, {2.759207, 100.762356, 10}, {2.775826, 99.713608, 10}, {2.792269, 98.660930, 10}, {2.808537, 97.606680, 10}, {2.824629, 96.553435, 10}, {2.840547, 95.503987, 10}, {2.856290, 94.461342, 10}, {2.871862, 93.428717, 10}, {2.887263, 92.409532, 10}, {2.902498, 91.407391, 10}, {2.917569, 90.426074, 10}, {2.932480, 89.469510, 10}, {2.947237, 88.541752, 10}, {2.961845, 87.646947, 10}, {2.976310, 86.789303, 10}, {2.990639, 85.973046, 10}, {3.004839, 85.202379, 10}, {3.018920, 84.481433, 10}, {3.032889, 83.814222, 10}, {3.046756, 83.204588, 10}, {3.060532, 82.656152, 10}, {3.074227, 82.172263, 10}, {3.087853, 81.755946, 10}, {3.101422, 81.409861, 10}, {3.114944, 81.136256, 10}, {3.128434, 80.936936, 10}, {3.141903, 80.813227, 10}, {3.155364, 80.765960, 10}, {3.168830, 80.795453, 10}, {3.182313, 80.901507, 10}, {3.195827, 81.083410, 10}, {3.209384, 81.339948, 10}, {3.222995, 81.669425, 10}, {3.236674, 82.069693, 10}, {3.250430, 82.538184, 10}, {3.264275, 83.071953, 10}, {3.278220, 83.667722, 10}, {3.292274, 84.321928, 10}, {3.306445, 85.030776, 10}, {3.320744, 85.790289, 10}, {3.335177, 86.596356, 10}, {3.349751, 87.444787, 10}, {3.364473, 88.331358, 10}, {3.379348, 89.251854, 10}, {3.394382, 90.202109, 10}, {3.409578, 91.178046, 10}, {3.424941, 92.175704, 10}, {3.440472, 93.191269, 10}, {3.456176, 94.221091, 10}, {3.472053, 95.261708, 10}, {3.488104, 96.309855, 10}, {3.504332, 97.362477, 10}, {3.520734, 98.416732, 10}, {3.537313, 99.469992, 10}, {3.554066, 100.519849, 10}, {3.570993, 101.564106, 10}, {3.588093, 102.600776, 10}, {3.605365, 103.628071, 10}, {3.622806, 104.644397, 10}, {3.640414, 105.648347, 10}, {3.658187, 106.638685, 10}, {3.676122, 107.614340, 10}, {3.694218, 108.574393, 10}, {3.712471, 109.518071, 10}, {3.730879, 110.444726, 10}, {3.749438, 111.353837, 10}, {3.768145, 112.244990, 10}, {3.786998, 113.117872, 10}, {3.805993, 113.972262, 10}, {3.825128, 114.808020, 10}, {3.844399, 115.625081, 10}, {3.863803, 116.423444, 10}, {3.883337, 117.203167, 10}, {3.902997, 117.964361, 10}, {3.922782, 118.707181, 10}, {3.942687, 119.431818, 10}, {3.962710, 120.138504, 10}, {3.982848, 120.827494, 10}, {4.003098, 121.499070, 10}, {4.023457, 122.153536, 10}, {4.043922, 122.791210, 10}, {4.064491, 123.412427, 10}, {4.085161, 124.017532, 10}, {4.105928, 124.606877, 10}, {4.126792, 125.180821, 10}, {4.147749, 125.739728, 10}, {4.168796, 126.283964, 10}, {4.189932, 126.813893, 10}, {4.213307, 140.255770, 10}, {4.238772, 152.788745, 10}, {4.264237, 152.788745, 10}, {4.289702, 152.788745, 10}, {4.315167, 152.788745, 10}, {4.340631, 152.788745, 10}, {4.366096, 152.788745, 10}, {4.391561, 152.788745, 10}, {4.417026, 152.788745, 10}, {4.442491, 152.788745, 10}, {4.467955, 152.788745, 10}, {4.493420, 152.788745, 10}, {4.518885, 152.788745, 10}, {4.544350, 152.788745, 10}, {4.569815, 152.788745, 10}, {4.595279, 152.788745, 10}, {4.620744, 152.788745, 10}, {4.646209, 152.788745, 10}, {4.671674, 152.788745, 10}, {4.697138, 152.788745, 10}, {4.722603, 152.788745, 10}, {4.748068, 152.788745, 10}, {4.773533, 152.788745, 10}, {4.798998, 152.788745, 10}, {4.824462, 152.788745, 10}, {4.849927, 152.788745, 10}, {4.875392, 152.788745, 10}, {4.900857, 152.788745, 10}, {4.926322, 152.788745, 10}, {4.951786, 152.788745, 10}, {4.977251, 152.788745, 10}, {5.002716, 152.788745, 10}, {5.028181, 152.788745, 10}, {5.053646, 152.788745, 10}, {5.079110, 152.788745, 10}, {5.104575, 152.788745, 10}, {5.130040, 152.788745, 10}, {5.155505, 152.788745, 10}, {5.180970, 152.788745, 10}, {5.206434, 152.788745, 10}, {5.231899, 152.788745, 10}, {5.257364, 152.788745, 10}, {5.282829, 152.788745, 10}, {5.308293, 152.788745, 10}, {5.333758, 152.788745, 10}, {5.359223, 152.788745, 10}, {5.384688, 152.788745, 10}, {5.410153, 152.788745, 10}, {5.435617, 152.788745, 10}, {5.461082, 152.788745, 10}, {5.484328, 139.474670, 10}, {5.505462, 126.801115, 10}, {5.526507, 126.270841, 10}, {5.547461, 125.726252, 10}, {5.568322, 125.166982, 10}, {5.589088, 124.592665, 10}, {5.609755, 124.002940, 10}, {5.630321, 123.397446, 10}, {5.650784, 122.775831, 10}, {5.671140, 122.137750, 10}, {5.691387, 121.482870, 10}, {5.711522, 120.810872, 10}, {5.731542, 120.121453, 10}, {5.751445, 119.414332, 10}, {5.771226, 118.689252, 10}, {5.790884, 117.945987, 10}, {5.810415, 117.184342, 10}, {5.829816, 116.404164, 10}, {5.849083, 115.605345, 10}, {5.868214, 114.787827, 10}, {5.887206, 113.951612, 10}, {5.906056, 113.096769, 10}, {5.924760, 112.223437, 10}, {5.943315, 111.331842, 10}, {5.961719, 110.422297, 10}, {5.979968, 109.495219, 10}, {5.998060, 108.551134, 10}, {6.015992, 107.590689, 10}, {6.033761, 106.614664, 10}, {6.051365, 105.623980, 10}, {6.068801, 104.619713, 10}, {6.086068, 103.603100, 10}, {6.103164, 102.575557, 10}, {6.120087, 101.538680, 10}, {6.136837, 100.494261, 10}, {6.153411, 99.444294, 10}, {6.169809, 98.390980, 10}, {6.186032, 97.336733, 10}, {6.202079, 96.284186, 10}, {6.217952, 95.236185, 10}, {6.233651, 94.195792, 10}, {6.249179, 93.166276, 10}, {6.264537, 92.151105, 10}, {6.279730, 91.153931, 10}, {6.294760, 90.178574, 10}, {6.309631, 89.228996, 10}, {6.324349, 88.309280, 10}, {6.338920, 87.423590, 10}, {6.353349, 86.576143, 10}, {6.367644, 85.771164, 10}, {6.381813, 85.012841, 10}, {6.395864, 84.305280, 10}, {6.409806, 83.652457, 10}, {6.423649, 83.058161, 10}, {6.437404, 82.525949, 10}, {6.451080, 82.059091, 10}, {6.464690, 81.660524, 10}, {6.478246, 81.332805, 10}, {6.491759, 81.078071, 10}, {6.505242, 80.898009, 10}, {6.518707, 80.793818, 10}, {6.532168, 80.766200, 10}, {6.545637, 80.815340, 10}, {6.559128, 80.940908, 10}, {6.572651, 81.142061, 10}, {6.586221, 81.417460, 10}, {6.599848, 81.765289, 10}, {6.613546, 82.183289, 10}, {6.627324, 82.668793, 10}, {6.641194, 83.218765, 10}, {6.655165, 83.829850, 10}, {6.669248, 84.498420, 10}, {6.683452, 85.220629, 10}, {6.697784, 85.992460, 10}, {6.712252, 86.809778, 10}, {6.726864, 87.668380, 10}, {6.741624, 88.564039, 10}, {6.756540, 89.492550, 10}, {6.771615, 90.449767, 10}, {6.786853, 91.431639, 10}, {6.802259, 92.434240, 10}, {6.817835, 93.453797, 10}, {6.833582, 94.486705, 10}, {6.849504, 95.529554, 10}, {6.865600, 96.579130, 10}, {6.881872, 97.632432, 10}, {6.898320, 98.686673, 10}, {6.914943, 99.739283, 10}, {6.931741, 100.787907, 10}, {6.948713, 101.830402, 10}, {6.965857, 102.864833, 10}, {6.983172, 103.889463, 10}, {7.000656, 104.902747, 10}, {7.018307, 105.903322, 10}, {7.036122, 106.889995, 10}, {7.054099, 107.861736, 10}, {7.072235, 108.817664, 10}, {7.090528, 109.757038, 10}, {7.108974, 110.679245, 10}, {7.127572, 111.583792, 10}, {7.146317, 112.470292, 10}, {7.165206, 113.338455, 10}, {7.184238, 114.188084, 10}, {7.203407, 115.019057, 10}, {7.222713, 115.831327, 10}, {7.242150, 116.624908, 10}, {7.261717, 117.399874, 10}, {7.281410, 118.156346, 10}, {7.301225, 118.894489, 10}, {7.321161, 119.614506, 10}, {7.341214, 120.316634, 10}, {7.361381, 121.001136, 10}, {7.381659, 121.668301, 10}, {7.402045, 122.318435, 10}, {7.422537, 122.951863, 10}, {7.443132, 123.568920, 10}, {7.463827, 124.169954, 10}, {7.484619, 124.755321, 10}, {7.505507, 125.325379, 10}, {7.526487, 125.880494, 10}, {7.547557, 126.421030, 10}, {7.568715, 126.947355, 10}, {7.589877, 126.967996, 10}, {7.610988, 126.666388, 10}, {7.632010, 126.132475, 10}, {7.652940, 125.584154, 10}, {7.673777, 125.021058, 10}, {7.694518, 124.442822, 10}, {7.715159, 123.849084, 10}, {7.735699, 123.239487, 10}, {7.756135, 122.613679, 10}, {7.776463, 121.971319, 10}, {7.796682, 121.312076, 10}, {7.816788, 120.635636, 10}, {7.836778, 119.941700, 10}, {7.856650, 119.229994, 10}, {7.876400, 118.500268, 10}, {7.896025, 117.752303, 10}, {7.915523, 116.985915, 10}, {7.934890, 116.200962, 10}, {7.954123, 115.397348, 10}, {7.973218, 114.575030, 10}, {7.992174, 113.734026, 10}, {8.010987, 112.874422, 10}, {8.029653, 111.996379, 10}, {8.048169, 111.100144, 10}, {8.066534, 110.186055, 10}, {8.084743, 109.254558, 10}, {8.102794, 108.306208, 10}, {8.120684, 107.341686, 10}, {8.138411, 106.361805, 10}, {8.155972, 105.367527, 10}, {8.173366, 104.359967, 10}, {8.190589, 103.340408, 10}, {8.207641, 102.310309, 10}, {8.224519, 101.271318, 10}, {8.241223, 100.225277, 10}, {8.257753, 99.174233, 10}, {8.274106, 98.120440, 10}, {8.290284, 97.066370, 10}, {8.306286, 96.014709, 10}, {8.322114, 94.968360, 10}, {8.337769, 93.930438, 10}, {8.353253, 92.904265, 10}, {8.368569, 91.893357, 10}, {8.383719, 90.901411, 10}, {8.398708, 89.932285, 10}, {8.413539, 88.989977, 10}, {8.428219, 88.078592, 10}, {8.442753, 87.202313, 10}, {8.457147, 86.365361, 10}, {8.471409, 85.571957, 10}, {8.485547, 84.826272, 10}, {8.499569, 84.132385, 10}, {8.513485, 83.494228, 10}, {8.527304, 82.915534, 10}, {8.541037, 82.399793, 10}, {8.554696, 81.950193, 10}, {8.568291, 81.569578, 10}, {8.581834, 81.260401, 10}, {8.595338, 81.024687, 10}, {8.608815, 80.863999, 10}, {8.622279, 80.779411, 10}, {8.635740, 80.771493, 10}, {8.649214, 80.840297, 10}, {8.662711, 80.985361, 10}, {8.676246, 81.205713, 10}, {8.689829, 81.499889, 10}, {8.703473, 81.865958, 10}, {8.717190, 82.301550, 10}, {8.730991, 82.803900, 10}, {8.744886, 83.369885, 10}, {8.758885, 83.996077, 10}, {8.772998, 84.678786, 10}, {8.787234, 85.414116, 10}, {8.801600, 86.198018, 10}, {8.816105, 87.026332, 10}, {8.830754, 87.894846, 10}, {8.845554, 88.799335, 10}, {8.860510, 89.735604, 10}, {8.875626, 90.699530, 10}, {8.890908, 91.687090, 10}, {8.906357, 92.694395, 10}, {8.921976, 93.717714, 10}, {8.937768, 94.753492, 10}, {8.953735, 95.798364, 10}, {8.969876, 96.849175, 10}, {8.986194, 97.902975, 10}, {9.002686, 98.957034, 10}, {9.019355, 100.008837, 10}, {9.036197, 101.056084, 10}, {9.053213, 102.096686, 10}, {9.070401, 103.128760, 10}, {9.087760, 104.150619, 10}, {9.105287, 105.160764, 10}, {9.122980, 106.157879, 10}, {9.140836, 107.140812, 10}, {9.158855, 108.108574, 10}, {9.177031, 109.060319, 10}, {9.195364, 109.995342, 10}, {9.213849, 110.913060, 10}, {9.232485, 111.813009, 10}, {9.251267, 112.694827, 10}, {9.270194, 113.558250, 10}, {9.289261, 114.403100, 10}, {9.308466, 115.229275, 10}, {9.327805, 116.036746, 10}, {9.347276, 116.825542, 10}, {9.366875, 117.595748, 10}, {9.386600, 118.347499, 10}, {9.406447, 119.080970, 10}, {9.426413, 119.796373, 10}, {9.446495, 120.493952, 10}, {9.466691, 121.173977, 10}, {9.486997, 121.836742, 10}, {9.507411, 122.482557, 10}, {9.527929, 123.111752, 10}, {9.548550, 123.724664, 10}, {9.569270, 124.321643, 10}, {9.590088, 124.903047, 10}, {9.610999, 125.469236, 10}, {9.632003, 126.020575, 10}, {9.653096, 126.557430, 10}, {9.674373, 127.663849, 10}, {9.699838, 152.788745, 10}, {9.725302, 152.788745, 10}, {9.750767, 152.788745, 10}, {9.776232, 152.788745, 10}, {9.801697, 152.788745, 10}, {9.827162, 152.788745, 10}, {9.852626, 152.788745, 10}, {9.878091, 152.788745, 10}, {9.903556, 152.788745, 10}, {9.929021, 152.788745, 10}, {9.954486, 152.788745, 10}, {9.979950, 152.785846, 10}, {10.005394, 152.666026, 10}, {10.030781, 152.318163, 10}, {10.056071, 151.742257, 10}, {10.081227, 150.938308, 10}, {10.106212, 149.906316, 10}, {10.130986, 148.646282, 10}, {10.155512, 147.158204, 10}, {10.179753, 145.442084, 10}, {10.203669, 143.497920, 10}, {10.227224, 141.328614, 10}, {10.250399, 139.048185, 10}, {10.273193, 136.767755, 10}, {10.295608, 134.487326, 10}, {10.317642, 132.206897, 10}, {10.339297, 129.926468, 10}, {10.360571, 127.646039, 10}, {10.381465, 125.365610, 10}, {10.401979, 123.085181, 10}, {10.422114, 120.804752, 10}, {10.441868, 118.524323, 10}, {10.461242, 116.243894, 10}, {10.480236, 113.963465, 10}, {10.498849, 111.683036, 10}, {10.517083, 109.402607, 10}, {10.534937, 107.122178, 10}, {10.552410, 104.841749, 10}, {10.569504, 102.561320, 10}, {10.586217, 100.280891, 10}, {10.602551, 98.000462, 10}, {10.618504, 95.720033, 10}, {10.634077, 93.439604, 10}, {10.649271, 91.159175, 10}, {10.664084, 88.878746, 10}, {10.678517, 86.598317, 10}, {10.692570, 84.317888, 10}, {10.706243, 82.037459, 10}, {10.719536, 79.757030, 10}, {10.732448, 77.476601, 10}, {10.744981, 75.196172, 10}, {10.757134, 72.915743, 10}, {10.768906, 70.635313, 10}, {10.780299, 68.354884, 10}, {10.791311, 66.074455, 10}, {10.801943, 63.794026, 10}, {10.812196, 61.513597, 10}, {10.822068, 59.233168, 10}, {10.831560, 56.952739, 10}, {10.840672, 54.672310, 10}, {10.849404, 52.391881, 10}, {10.857756, 50.111452, 10}, {10.865728, 47.831023, 10}, {10.873320, 45.550594, 10}, {10.880531, 43.270165, 10}, {10.887363, 40.989736, 10}, {10.893814, 38.709307, 10}, {10.899886, 36.428878, 10}, {10.905577, 34.148449, 10}, {10.910889, 31.868020, 10}, {10.915820, 29.587591, 10}, {10.920371, 27.307162, 10}, {10.924542, 25.026733, 10}, {10.928333, 22.746304, 10}, {10.931744, 20.465875, 10}, {10.934775, 18.185446, 10}, {10.937426, 15.905017, 10}, {10.939697, 13.624588, 10}, {10.941588, 11.347058, 10}, {10.943119, 9.186449, 10}, {10.944328, 7.253883, 10}, {10.945253, 5.549360, 10}, {10.945932, 4.072880, 10}, {10.946402, 2.824442, 10}, {10.946703, 1.804048, 10}, {10.946872, 1.011696, 10}, {10.946946, 0.447388, 10}, {10.946965, 0.111122, 10}, {10.946965, 0.000000, 10}
    };
    private static final double[][] rightPoints = new double[][]{
        {0.000019, 0.228043, 10}, {0.000088, 0.416940, 10}, {0.000288, 1.197244, 10}, {0.000643, 2.128491, 10}, {0.001197, 3.325913, 10}, {0.001995, 4.789626, 10}, {0.003082, 6.519805, 10}, {0.004501, 8.516693, 10}, {0.006298, 10.780612, 10}, {0.008517, 13.311979, 10}, {0.011180, 15.978148, 10}, {0.014288, 18.646387, 10}, {0.017840, 21.317052, 10}, {0.021839, 23.990504, 10}, {0.026283, 26.667108, 10}, {0.031175, 29.347236, 10}, {0.036513, 32.031269, 10}, {0.042300, 34.719592, 10}, {0.048535, 37.412603, 10}, {0.055220, 40.110706, 10}, {0.062356, 42.814318, 10}, {0.069943, 45.523865, 10}, {0.077983, 48.239788, 10}, {0.086477, 50.962538, 10}, {0.095426, 53.692581, 10}, {0.104831, 56.430400, 10}, {0.114694, 59.176491, 10}, {0.125016, 61.931371, 10}, {0.135798, 64.695571, 10}, {0.147043, 67.469644, 10}, {0.158752, 70.254165, 10}, {0.170927, 73.049726, 10}, {0.183570, 75.856948, 10}, {0.196683, 78.676472, 10}, {0.210267, 81.508968, 10}, {0.224327, 84.355130, 10}, {0.238863, 87.215684, 10}, {0.253878, 90.091382, 10}, {0.269375, 92.983012, 10}, {0.285357, 95.891391, 10}, {0.301826, 98.817372, 10}, {0.318787, 101.761844, 10}, {0.336241, 104.725732, 10}, {0.354193, 107.710002, 10}, {0.372645, 110.715657, 10}, {0.391603, 113.743741, 10}, {0.411069, 116.795343, 10}, {0.431047, 119.871591, 10}, {0.451543, 122.973660, 10}, {0.472560, 126.102767, 10}, {0.494103, 129.260171, 10}, {0.516178, 132.447179, 10}, {0.538789, 135.665135, 10}, {0.561941, 138.915427, 10}, {0.585641, 142.199481, 10}, {0.609894, 145.518759, 10}, {0.634707, 148.874751, 10}, {0.660085, 152.268974, 10}, {0.686035, 155.702965, 10}, {0.712565, 159.178267, 10}, {0.739681, 162.696425, 10}, {0.767391, 166.258969, 10}, {0.795702, 169.867398, 10}, {0.824623, 173.523165, 10}, {0.854161, 177.227654, 10}, {0.884324, 180.982150, 10}, {0.915122, 184.787816, 10}, {0.946538, 188.495584, 10}, {0.978530, 191.952566, 10}, {1.011056, 195.153281, 10}, {1.044071, 198.091650, 10}, {1.077531, 200.761004, 10}, {1.111390, 203.154106, 10}, {1.145601, 205.263191, 10}, {1.180114, 207.080012, 10}, {1.214880, 208.595910, 10}, {1.249847, 209.801897, 10}, {1.284988, 210.846481, 10}, {1.320302, 211.881889, 10}, {1.355786, 212.904754, 10}, {1.391438, 213.911515, 10}, {1.427254, 214.898439, 10}, {1.463231, 215.861632, 10}, {1.499364, 216.797070, 10}, {1.535648, 217.700629, 10}, {1.572076, 218.568112, 10}, {1.608641, 219.395296, 10}, {1.645338, 220.177969, 10}, {1.682156, 220.911975, 10}, {1.719089, 221.593268, 10}, {1.756125, 222.217956, 10}, {1.793255, 222.782358, 10}, {1.830469, 223.283052, 10}, {1.867755, 223.716924, 10}, {1.905102, 224.081217, 10}, {1.942498, 224.373574, 10}, {1.979930, 224.592075, 10}, {2.017386, 224.735268, 10}, {2.054853, 224.802193, 10}, {2.092318, 224.792401, 10}, {2.129769, 224.705956, 10}, {2.167193, 224.543440, 10}, {2.204577, 224.305941, 10}, {2.241910, 223.995032, 10}, {2.279179, 223.612748, 10}, {2.316372, 223.161552, 10}, {2.353480, 222.644298, 10}, {2.390490, 222.064180, 10}, {2.427394, 221.424692, 10}, {2.464183, 220.729575, 10}, {2.500847, 219.982764, 10}, {2.537378, 219.188339, 10}, {2.573770, 218.350472, 10}, {2.610015, 217.473385, 10}, {2.646109, 216.561297, 10}, {2.682045, 215.618389, 10}, {2.717820, 214.648765, 10}, {2.753429, 213.656417, 10}, {2.788870, 212.645199, 10}, {2.824140, 211.618804, 10}, {2.859237, 210.580743, 10}, {2.894159, 209.534332, 10}, {2.928906, 208.482682, 10}, {2.963478, 207.428689, 10}, {2.997874, 206.375035, 10}, {3.032094, 205.324184, 10}, {3.066141, 204.278386, 10}, {3.100014, 203.239684, 10}, {3.133716, 202.209914, 10}, {3.167247, 201.190718, 10}, {3.200611, 200.183552, 10}, {3.233810, 199.189694, 10}, {3.266845, 198.210257, 10}, {3.299719, 197.246196, 10}, {3.332435, 196.298322, 10}, {3.364997, 195.367314, 10}, {3.397406, 194.453725, 10}, {3.429665, 193.557995, 10}, {3.461779, 192.680461, 10}, {3.493749, 191.821369, 10}, {3.525579, 190.980877, 10}, {3.557272, 190.159071, 10}, {3.588832, 189.355965, 10}, {3.620260, 188.571516, 10}, {3.651561, 187.805628, 10}, {3.682737, 187.058155, 10}, {3.713792, 186.328916, 10}, {3.744729, 185.617688, 10}, {3.775549, 184.924223, 10}, {3.806257, 184.248243, 10}, {3.836856, 183.589453, 10}, {3.867347, 182.947535, 10}, {3.897734, 182.322160, 10}, {3.928019, 181.712985, 10}, {3.958206, 181.119660, 10}, {3.988296, 180.541827, 10}, {4.018293, 179.979123, 10}, {4.048198, 179.431183, 10}, {4.078014, 178.897642, 10}, {4.107705, 178.144095, 10}, {4.137479, 178.642243, 10}, {4.167340, 179.168886, 10}, {4.197292, 179.709750, 10}, {4.227336, 180.265199, 10}, {4.257475, 180.835599, 10}, {4.287712, 181.421315, 10}, {4.318049, 182.022706, 10}, {4.348489, 182.640127, 10}, {4.379035, 183.273925, 10}, {4.409689, 183.924437, 10}, {4.440454, 184.591985, 10}, {4.471334, 185.276876, 10}, {4.502330, 185.979398, 10}, {4.533447, 186.699813, 10}, {4.564687, 187.438357, 10}, {4.596053, 188.195232, 10}, {4.627548, 188.970603, 10}, {4.659175, 189.764590, 10}, {4.690938, 190.577264, 10}, {4.722839, 191.408638, 10}, {4.754883, 192.258663, 10}, {4.787070, 193.127217, 10}, {4.819406, 194.014098, 10}, {4.851893, 194.919016, 10}, {4.884533, 195.841580, 10}, {4.917330, 196.781295, 10}, {4.950286, 197.737544, 10}, {4.983404, 198.709584, 10}, {5.016687, 199.696530, 10}, {5.050137, 200.697347, 10}, {5.083755, 201.710839, 10}, {5.117544, 202.735639, 10}, {5.151506, 203.770198, 10}, {5.185641, 204.812773, 10}, {5.219952, 205.861424, 10}, {5.254437, 206.914004, 10}, {5.289099, 207.968153, 10}, {5.323936, 209.021296, 10}, {5.358947, 210.070641, 10}, {5.394133, 211.113180, 10}, {5.429491, 212.145698, 10}, {5.465018, 213.164778, 10}, {5.500712, 214.166812, 10}, {5.536570, 215.148023, 10}, {5.572588, 216.104482, 10}, {5.608760, 217.032137, 10}, {5.645081, 217.926840, 10}, {5.681545, 218.784386, 10}, {5.718145, 219.600549, 10}, {5.754874, 220.371126, 10}, {5.791722, 221.091986, 10}, {5.828682, 221.759117, 10}, {5.865744, 222.368678, 10}, {5.902897, 222.917046, 10}, {5.940130, 223.400876, 10}, {5.977433, 223.817142, 10}, {6.014793, 224.163184, 10}, {6.052200, 224.436754, 10}, {6.089639, 224.636050, 10}, {6.127099, 224.759743, 10}, {6.164567, 224.807004, 10}, {6.202030, 224.777515, 10}, {6.239475, 224.671474, 10}, {6.276890, 224.489594, 10}, {6.314262, 224.233088, 10}, {6.351579, 223.903651, 10}, {6.388830, 223.503433, 10}, {6.426002, 223.035000, 10}, {6.463086, 222.501296, 10}, {6.500070, 221.905600, 10}, {6.536945, 221.251472, 10}, {6.573702, 220.542708, 10}, {6.610333, 219.783285, 10}, {6.646829, 218.977312, 10}, {6.683184, 218.128977, 10}, {6.719391, 217.242507, 10}, {6.755445, 216.322114, 10}, {6.791340, 215.371964, 10}, {6.827073, 214.396132, 10}, {6.862639, 213.398580, 10}, {6.898036, 212.383123, 10}, {6.933262, 211.353407, 10}, {6.968314, 210.312895, 10}, {7.003192, 209.264852, 10}, {7.037894, 208.212332, 10}, {7.072420, 207.158180, 10}, {7.106771, 206.105018, 10}, {7.140947, 205.055258, 10}, {7.174949, 204.011094, 10}, {7.208778, 202.974517, 10}, {7.242436, 201.947311, 10}, {7.275924, 200.931071, 10}, {7.309245, 199.927204, 10}, {7.342401, 198.936947, 10}, {7.375395, 197.961370, 10}, {7.408229, 197.001391, 10}, {7.440905, 196.057787, 10}, {7.473427, 195.131200, 10}, {7.505797, 194.222156, 10}, {7.538019, 193.331066, 10}, {7.570095, 192.458246, 10}, {7.602029, 191.603914, 10}, {7.633824, 190.768212, 10}, {7.665483, 189.951205, 10}, {7.697008, 189.152893, 10}, {7.728404, 188.373218, 10}, {7.759672, 187.612071, 10}, {7.790817, 186.869297, 10}, {7.821841, 186.144701, 10}, {7.852748, 185.438057, 10}, {7.883539, 184.749105, 10}, {7.914219, 184.077566, 10}, {7.944789, 183.423136, 10}, {7.975253, 182.785495, 10}, {8.005614, 182.164310, 10}, {8.035874, 181.559236, 10}, {8.066036, 180.969921, 10}, {8.096102, 180.396005, 10}, {8.126075, 179.837124, 10}, {8.155957, 179.292914, 10}, {8.185751, 178.763009, 10}, {8.213279, 165.168766, 10}, {8.238743, 152.788745, 10}, {8.264208, 152.788745, 10}, {8.289673, 152.788745, 10}, {8.315138, 152.788745, 10}, {8.340603, 152.788745, 10}, {8.366067, 152.788745, 10}, {8.391532, 152.788745, 10}, {8.416997, 152.788745, 10}, {8.442462, 152.788745, 10}, {8.467927, 152.788745, 10}, {8.493391, 152.788745, 10}, {8.518856, 152.788745, 10}, {8.544321, 152.788745, 10}, {8.569786, 152.788745, 10}, {8.595251, 152.788745, 10}, {8.620715, 152.788745, 10}, {8.646180, 152.788745, 10}, {8.671645, 152.788745, 10}, {8.697110, 152.788745, 10}, {8.722575, 152.788745, 10}, {8.748039, 152.788745, 10}, {8.773504, 152.788745, 10}, {8.798969, 152.788745, 10}, {8.824434, 152.788745, 10}, {8.849898, 152.788745, 10}, {8.875363, 152.788745, 10}, {8.900828, 152.788745, 10}, {8.926293, 152.788745, 10}, {8.951758, 152.788745, 10}, {8.977222, 152.788745, 10}, {9.002687, 152.788745, 10}, {9.028152, 152.788745, 10}, {9.053617, 152.788745, 10}, {9.079082, 152.788745, 10}, {9.104546, 152.788745, 10}, {9.130011, 152.788745, 10}, {9.155476, 152.788745, 10}, {9.180941, 152.788745, 10}, {9.206406, 152.788745, 10}, {9.231870, 152.788745, 10}, {9.257335, 152.788745, 10}, {9.282800, 152.788745, 10}, {9.308265, 152.788745, 10}, {9.333729, 152.788745, 10}, {9.359194, 152.788745, 10}, {9.384659, 152.788745, 10}, {9.410124, 152.788745, 10}, {9.435589, 152.788745, 10}, {9.461053, 152.788745, 10}, {9.488661, 165.644268, 10}, {9.518457, 178.775786, 10}, {9.548341, 179.306036, 10}, {9.578316, 179.850600, 10}, {9.608385, 180.409843, 10}, {9.638549, 180.984132, 10}, {9.668811, 181.573828, 10}, {9.699174, 182.179291, 10}, {9.729641, 182.800874, 10}, {9.760214, 183.438921, 10}, {9.790896, 184.093765, 10}, {9.821691, 184.765726, 10}, {9.852600, 185.455106, 10}, {9.883627, 186.162187, 10}, {9.914775, 186.887224, 10}, {9.946046, 187.630445, 10}, {9.977445, 188.392043, 10}, {10.008974, 189.172172, 10}, {10.040636, 189.970940, 10}, {10.072434, 190.788404, 10}, {10.104371, 191.624562, 10}, {10.136451, 192.479347, 10}, {10.168676, 193.352617, 10}, {10.201050, 194.244149, 10}, {10.233576, 195.153627, 10}, {10.266256, 196.080636, 10}, {10.299094, 197.024650, 10}, {10.332091, 197.985019, 10}, {10.365251, 198.960966, 10}, {10.398577, 199.951569, 10}, {10.432069, 200.955753, 10}, {10.465731, 201.972279, 10}, {10.499565, 202.999733, 10}, {10.533571, 204.036519, 10}, {10.567751, 205.080843, 10}, {10.602106, 206.130713, 10}, {10.636637, 207.183929, 10}, {10.671343, 208.238074, 10}, {10.706225, 209.290519, 10}, {10.741281, 210.338415, 10}, {10.776511, 211.378703, 10}, {10.811912, 212.408113, 10}, {10.847483, 213.423177, 10}, {10.883219, 214.420245, 10}, {10.919119, 215.395496, 10}, {10.955176, 216.344969, 10}, {10.991387, 217.264583, 10}, {11.027745, 218.150172, 10}, {11.064245, 218.997521, 10}, {11.100879, 219.802408, 10}, {11.137639, 220.560642, 10}, {11.174517, 221.268118, 10}, {11.211504, 221.920863, 10}, {11.248589, 222.515086, 10}, {11.285764, 223.047233, 10}, {11.323016, 223.514034, 10}, {11.360335, 223.912552, 10}, {11.397708, 224.240230, 10}, {11.435124, 224.494932, 10}, {11.472570, 224.674972, 10}, {11.510033, 224.779149, 10}, {11.547501, 224.806764, 10}, {11.584961, 224.757630, 10}, {11.622399, 224.632078, 10}, {11.659804, 224.430950, 10}, {11.697164, 224.155586, 10}, {11.734465, 223.807800, 10}, {11.771697, 223.389851, 10}, {11.808847, 222.904407, 10}, {11.845906, 222.354502, 10}, {11.882864, 221.743491, 10}, {11.919710, 221.075001, 10}, {11.956435, 220.352878, 10}, {11.993032, 219.581138, 10}, {12.029493, 218.763914, 10}, {12.065810, 217.905410, 10}, {12.101978, 217.009852, 10}, {12.137992, 216.081444, 10}, {12.173846, 215.124332, 10}, {12.209536, 214.142566, 10}, {12.245060, 213.140072, 10}, {12.280413, 212.120622, 10}, {12.315595, 211.087819, 10}, {12.350602, 210.045076, 10}, {12.385435, 208.995603, 10}, {12.420092, 207.942404, 10}, {12.454573, 206.888263, 10}, {12.488879, 205.835752, 10}, {12.523010, 204.787224, 10}, {12.556968, 203.744822, 10}, {12.590753, 202.710483, 10}, {12.624367, 201.685941, 10}, {12.657813, 200.672743, 10}, {12.691091, 199.672251, 10}, {12.724206, 198.685658, 10}, {12.757158, 197.713994, 10}, {12.789951, 196.758140, 10}, {12.822587, 195.818837, 10}, {12.855070, 194.896698, 10}, {12.887402, 193.992217, 10}, {12.919587, 193.105780, 10}, {12.951626, 192.237677, 10}, {12.983524, 191.388107, 10}, {13.015284, 190.557189, 10}, {13.046908, 189.744972, 10}, {13.078400, 188.951441, 10}, {13.109763, 188.176524, 10}, {13.140999, 187.420099, 10}, {13.172113, 186.681999, 10}, {13.203107, 185.962024, 10}, {13.233983, 185.259937, 10}, {13.264746, 184.575473, 10}, {13.295397, 183.908345, 10}, {13.325940, 183.258245, 10}, {13.356378, 182.624851, 10}, {13.386712, 182.007826, 10}, {13.416947, 181.406822, 10}, {13.447084, 180.821485, 10}, {13.477126, 180.251453, 10}, {13.507075, 179.696365, 10}, {13.536934, 179.155854, 10}, {13.566706, 178.629553, 10}, {13.596398, 178.150559, 10}, {13.626216, 178.910507, 10}, {13.656124, 179.444395, 10}, {13.686122, 179.992691, 10}, {13.716215, 180.555760, 10}, {13.746404, 181.133968, 10}, {13.776692, 181.727676, 10}, {13.807081, 182.337242, 10}, {13.837575, 182.963017, 10}, {13.868176, 183.605343, 10}, {13.898887, 184.264550, 10}, {13.929710, 184.940953, 10}, {13.960650, 185.634849, 10}, {13.991707, 186.346514, 10}, {14.022887, 187.076196, 10}, {14.054191, 187.824117, 10}, {14.085622, 188.590457, 10}, {14.117185, 189.375360, 10}, {14.148881, 190.178923, 10}, {14.180715, 191.001186, 10}, {14.212689, 191.842134, 10}, {14.244806, 192.701679, 10}, {14.277069, 193.579660, 10}, {14.309482, 194.475831, 10}, {14.342046, 195.389851, 10}, {14.374767, 196.321279, 10}, {14.407645, 197.269556, 10}, {14.440684, 198.234003, 10}, {14.473886, 199.213804, 10}, {14.507254, 200.208001, 10}, {14.540790, 201.215477, 10}, {14.574496, 202.234949, 10}, {14.608374, 203.264958, 10}, {14.642424, 204.303856, 10}, {14.676649, 205.349802, 10}, {14.711049, 206.400749, 10}, {14.745625, 207.454442, 10}, {14.780376, 208.508411, 10}, {14.815303, 209.559969, 10}, {14.850404, 210.606213, 10}, {14.885678, 211.644029, 10}, {14.921123, 212.670096, 10}, {14.956737, 213.680898, 10}, {14.992515, 214.672738, 10}, {15.028456, 215.641758, 10}, {15.064553, 216.583962, 10}, {15.100802, 217.495244, 10}, {15.137197, 218.371424, 10}, {15.173732, 219.208279, 10}, {15.210399, 220.001591, 10}, {15.247190, 220.747188, 10}, {15.284097, 221.440992, 10}, {15.321110, 222.079073, 10}, {15.358220, 222.657696, 10}, {15.395415, 223.173374, 10}, {15.432686, 223.622918, 10}, {15.470020, 224.003486, 10}, {15.507405, 224.312624, 10}, {15.544830, 224.548309, 10}, {15.582282, 224.708977, 10}, {15.619747, 224.793554, 10}, {15.657214, 224.801472, 10}, {15.694669, 224.732676, 10}, {15.732101, 224.587630, 10}, {15.769495, 224.367306, 10}, {15.806841, 224.073166, 10}, {15.844125, 223.707144, 10}, {15.881337, 223.271605, 10}, {15.918465, 222.769317, 10}, {15.955499, 222.203400, 10}, {15.992429, 221.577284, 10}, {16.029245, 220.894657, 10}, {16.065938, 220.159413, 10}, {16.102501, 219.375603, 10}, {16.138925, 218.547384, 10}, {16.175205, 217.678970, 10}, {16.211334, 216.774582, 10}, {16.247307, 215.838417, 10}, {16.283120, 214.874597, 10}, {16.318767, 213.887143, 10}, {16.354247, 212.879944, 10}, {16.389557, 211.856731, 10}, {16.424694, 210.821060, 10}, {16.459656, 209.776292, 10}, {16.494444, 208.725586, 10}, {16.529056, 207.671887, 10}, {16.563492, 206.617928, 10}, {16.597753, 205.566223, 10}, {16.631840, 204.519071, 10}, {16.665753, 203.478562, 10}, {16.699494, 202.446579, 10}, {16.733065, 201.424808, 10}, {16.766467, 200.414747, 10}, {16.799704, 199.417715, 10}, {16.832776, 198.434860, 10}, {16.865687, 197.467175, 10}, {16.898440, 196.515503, 10}, {16.931037, 195.580551, 10}, {16.963480, 194.662900, 10}, {16.995774, 193.763017, 10}, {17.027921, 192.881261, 10}, {17.059924, 192.017898, 10}, {17.091786, 191.173105, 10}, {17.123511, 190.346984, 10}, {17.155101, 189.539566, 10}, {17.186559, 188.750820, 10}, {17.217889, 187.980662, 10}, {17.249094, 187.228957, 10}, {17.280177, 186.495529, 10}, {17.311140, 185.780168, 10}, {17.341987, 185.082629, 10}, {17.372721, 184.402641, 10}, {17.403344, 183.739913, 10}, {17.433860, 183.094132, 10}, {17.464271, 182.464971, 10}, {17.494579, 181.852090, 10}, {17.524789, 181.255140, 10}, {17.554901, 180.673765, 10}, {17.584919, 180.107603, 10}, {17.614845, 179.556291, 10}, {17.644682, 179.019460, 10}, {17.674308, 177.760280, 10}, {17.699773, 152.788745, 10}, {17.725238, 152.788745, 10}, {17.750703, 152.788745, 10}, {17.776167, 152.788745, 10}, {17.801632, 152.788745, 10}, {17.827097, 152.788745, 10}, {17.852562, 152.788745, 10}, {17.878027, 152.788745, 10}, {17.903491, 152.788745, 10}, {17.928956, 152.788745, 10}, {17.954421, 152.788745, 10}, {17.979885, 152.785846, 10}, {18.005330, 152.666026, 10}, {18.030716, 152.318163, 10}, {18.056006, 151.742257, 10}, {18.081163, 150.938308, 10}, {18.106147, 149.906316, 10}, {18.130921, 148.646282, 10}, {18.155448, 147.158204, 10}, {18.179688, 145.442084, 10}, {18.203605, 143.497920, 10}, {18.227159, 141.328614, 10}, {18.250334, 139.048185, 10}, {18.273129, 136.767755, 10}, {18.295543, 134.487326, 10}, {18.317578, 132.206897, 10}, {18.339232, 129.926468, 10}, {18.360506, 127.646039, 10}, {18.381401, 125.365610, 10}, {18.401915, 123.085181, 10}, {18.422049, 120.804752, 10}, {18.441803, 118.524323, 10}, {18.461177, 116.243894, 10}, {18.480171, 113.963465, 10}, {18.498785, 111.683036, 10}, {18.517019, 109.402607, 10}, {18.534872, 107.122178, 10}, {18.552346, 104.841749, 10}, {18.569439, 102.561320, 10}, {18.586153, 100.280891, 10}, {18.602486, 98.000462, 10}, {18.618440, 95.720033, 10}, {18.634013, 93.439604, 10}, {18.649206, 91.159175, 10}, {18.664019, 88.878746, 10}, {18.678452, 86.598317, 10}, {18.692505, 84.317888, 10}, {18.706178, 82.037459, 10}, {18.719471, 79.757030, 10}, {18.732384, 77.476601, 10}, {18.744916, 75.196172, 10}, {18.757069, 72.915743, 10}, {18.768842, 70.635313, 10}, {18.780234, 68.354884, 10}, {18.791247, 66.074455, 10}, {18.801879, 63.794026, 10}, {18.812131, 61.513597, 10}, {18.822003, 59.233168, 10}, {18.831495, 56.952739, 10}, {18.840608, 54.672310, 10}, {18.849339, 52.391881, 10}, {18.857691, 50.111452, 10}, {18.865663, 47.831023, 10}, {18.873255, 45.550594, 10}, {18.880467, 43.270165, 10}, {18.887298, 40.989736, 10}, {18.893750, 38.709307, 10}, {18.899821, 36.428878, 10}, {18.905513, 34.148449, 10}, {18.910824, 31.868020, 10}, {18.915755, 29.587591, 10}, {18.920307, 27.307162, 10}, {18.924478, 25.026733, 10}, {18.928269, 22.746304, 10}, {18.931680, 20.465875, 10}, {18.934711, 18.185446, 10}, {18.937361, 15.905017, 10}, {18.939632, 13.624588, 10}, {18.941523, 11.347058, 10}, {18.943054, 9.186449, 10}, {18.944263, 7.253883, 10}, {18.945188, 5.549360, 10}, {18.945867, 4.072880, 10}, {18.946338, 2.824442, 10}, {18.946639, 1.804048, 10}, {18.946807, 1.011696, 10}, {18.946882, 0.447388, 10}, {18.946900, 0.111122, 10}, {18.946900, 0.000000, 10}
    };
}