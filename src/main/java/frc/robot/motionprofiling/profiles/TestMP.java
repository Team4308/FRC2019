package frc.robot.motionprofiling.profiles;
import frc.robot.motionprofiling.GeneratedMotionProfile;
public class TestMP implements GeneratedMotionProfile {
    public int kNumPoints() {return kNumPoints;}
    public double kTimeStep() {return kTimeStep;}
    public boolean bForward() {return bForward;}
    public double[][] leftPoints() {return leftPoints;}
    public double[][] rightPoints() {return rightPoints;}
    private final double kTimeStep = 0.010;
    private final int kNumPoints = 463;
    private final boolean bForward = true;
    // private static final int kNumPoints_R = 463;
    // Position (rotations) Velocity (RPM) Duration (ms)
    private final double[][] leftPoints = new double[][]{
        {0.000019, 0.228043, 10}, {0.000028, 0.051311, 10}, {0.000147, 0.718295, 10}, {0.000360, 1.276827, 10}, {0.000693, 1.994676, 10}, {0.001171, 2.871547, 10}, {0.001822, 3.907003, 10}, {0.002672, 5.100432, 10}, {0.003748, 6.451020, 10}, {0.005074, 7.957715, 10}, {0.006664, 9.539748, 10}, {0.008517, 11.116563, 10}, {0.010631, 12.687262, 10}, {0.013006, 14.250937, 10}, {0.015641, 15.806666, 10}, {0.018533, 17.353511, 10}, {0.021681, 18.890519, 10}, {0.025084, 20.416715, 10}, {0.028739, 21.931105, 10}, {0.032645, 23.432676, 10}, {0.036798, 24.920390, 10}, {0.041197, 26.393186, 10}, {0.045839, 27.849976, 10}, {0.050720, 29.289651, 10}, {0.055839, 30.711070, 10}, {0.061191, 32.113071, 10}, {0.066773, 33.494459, 10}, {0.072582, 34.854020, 10}, {0.078614, 36.190511, 10}, {0.084865, 37.502664, 10}, {0.091329, 38.789193, 10}, {0.098004, 40.048789, 10}, {0.104884, 41.280130, 10}, {0.111965, 42.481886, 10}, {0.119240, 43.652718, 10}, {0.126705, 44.791293, 10}, {0.134355, 45.896287, 10}, {0.142182, 46.966403, 10}, {0.150182, 48.000374, 10}, {0.158349, 48.996987, 10}, {0.166674, 49.955093, 10}, {0.175153, 50.873635, 10}, {0.183779, 51.751667, 10}, {0.192543, 52.588380, 10}, {0.201441, 53.383138, 10}, {0.210463, 54.135509, 10}, {0.219604, 54.845306, 10}, {0.228856, 55.512633, 10}, {0.238212, 56.137930, 10}, {0.247666, 56.722032, 10}, {0.257211, 57.266220, 10}, {0.266839, 57.772293, 10}, {0.276546, 58.242623, 10}, {0.286326, 58.680233, 10}, {0.296175, 59.088860, 10}, {0.306087, 59.473028, 10}, {0.316060, 59.838113, 10}, {0.326091, 60.190401, 10}, {0.336181, 60.537144, 10}, {0.346329, 60.886597, 10}, {0.356537, 61.248038, 10}, {0.366809, 61.631768, 10}, {0.377150, 62.049086, 10}, {0.387569, 62.512231, 10}, {0.398075, 63.034287, 10}, {0.408679, 63.629053, 10}, {0.419398, 64.310873, 10}, {0.430238, 65.042830, 10}, {0.441203, 65.788356, 10}, {0.452297, 66.560944, 10}, {0.463525, 67.371309, 10}, {0.474896, 68.226951, 10}, {0.486418, 69.131832, 10}, {0.498099, 70.086177, 10}, {0.509947, 71.086411, 10}, {0.521968, 72.125252, 10}, {0.534167, 73.191931, 10}, {0.546555, 74.328468, 10}, {0.559151, 75.579054, 10}, {0.571974, 76.933720, 10}, {0.585037, 78.382057, 10}, {0.598356, 79.913418, 10}, {0.611942, 81.517110, 10}, {0.625806, 83.182561, 10}, {0.639956, 84.899477, 10}, {0.654399, 86.657964, 10}, {0.669140, 88.448636, 10}, {0.684184, 90.262693, 10}, {0.699533, 92.091983, 10}, {0.715188, 93.929032, 10}, {0.731149, 95.767071, 10}, {0.747416, 97.600031, 10}, {0.763986, 99.422538, 10}, {0.780858, 101.229889, 10}, {0.798027, 103.018022, 10}, {0.815491, 104.783479, 10}, {0.833245, 106.523369, 10}, {0.851284, 108.235319, 10}, {0.869604, 109.917435, 10}, {0.888199, 111.568255, 10}, {0.907063, 113.186708, 10}, {0.926192, 114.772070, 10}, {0.945579, 116.323925, 10}, {0.965219, 117.842130, 10}, {0.985107, 119.326777, 10}, {1.005237, 120.778166, 10}, {1.025603, 122.196774, 10}, {1.046200, 123.583227, 10}, {1.067023, 124.938282, 10}, {1.088067, 126.262801, 10}, {1.109327, 127.557736, 10}, {1.130797, 128.824112, 10}, {1.152475, 130.063013, 10}, {1.174354, 131.275570, 10}, {1.196431, 132.462949, 10}, {1.218702, 133.626344, 10}, {1.241163, 134.766969, 10}, {1.263811, 135.886052, 10}, {1.286642, 136.984828, 10}, {1.309652, 138.064534, 10}, {1.332840, 139.126410, 10}, {1.356202, 140.171692, 10}, {1.379736, 141.201612, 10}, {1.403439, 142.217394, 10}, {1.427309, 143.220256, 10}, {1.451344, 144.211409, 10}, {1.475543, 145.192053, 10}, {1.499903, 146.163382, 10}, {1.524424, 147.126582, 10}, {1.549105, 148.082831, 10}, {1.573944, 149.033300, 10}, {1.598940, 149.979155, 10}, {1.624094, 150.921558, 10}, {1.649404, 151.861666, 10}, {1.674871, 152.800633, 10}, {1.700494, 153.739615, 10}, {1.726274, 154.679764, 10}, {1.752211, 155.622236, 10}, {1.778306, 156.568188, 10}, {1.804559, 157.518782, 10}, {1.830971, 158.475184, 10}, {1.857544, 159.438565, 10}, {1.884279, 160.410103, 10}, {1.911178, 161.390985, 10}, {1.938242, 162.382403, 10}, {1.965473, 163.385560, 10}, {1.992873, 164.401666, 10}, {2.020445, 165.431937, 10}, {2.048191, 166.477600, 10}, {2.076114, 167.539886, 10}, {2.104218, 168.620031, 10}, {2.132504, 169.719274, 10}, {2.160977, 170.838853, 10}, {2.189641, 171.980004, 10}, {2.218498, 173.143951, 10}, {2.247553, 174.331910, 10}, {2.276811, 175.545072, 10}, {2.306275, 176.784605, 10}, {2.335950, 178.051637, 10}, {2.365842, 179.347250, 10}, {2.395954, 180.672468, 10}, {2.426292, 182.028240, 10}, {2.456861, 183.415427, 10}, {2.487667, 184.834780, 10}, {2.518715, 186.286923, 10}, {2.550010, 187.772328, 10}, {2.581558, 189.291290, 10}, {2.613366, 190.843895, 10}, {2.645437, 192.429994, 10}, {2.677779, 194.049163, 10}, {2.710396, 195.700670, 10}, {2.743293, 197.383432, 10}, {2.776476, 199.095979, 10}, {2.809948, 200.836404, 10}, {2.843715, 202.602323, 10}, {2.877781, 204.390830, 10}, {2.912147, 206.198452, 10}, {2.946817, 208.021112, 10}, {2.981793, 209.854090, 10}, {3.017075, 211.691995, 10}, {3.052663, 213.528742, 10}, {3.088556, 215.357545, 10}, {3.124751, 217.170913, 10}, {3.161244, 218.960677, 10}, {3.198031, 220.718024, 10}, {3.235103, 222.433554, 10}, {3.272453, 224.097365, 10}, {3.310069, 225.699154, 10}, {3.347941, 227.228348, 10}, {3.386053, 228.674253, 10}, {3.424391, 230.026230, 10}, {3.462936, 231.273879, 10}, {3.501671, 232.407246, 10}, {3.540574, 233.417029, 10}, {3.579623, 234.294782, 10}, {3.618795, 235.033119, 10}, {3.658066, 235.625893, 10}, {3.697411, 236.068346, 10}, {3.736804, 236.357243, 10}, {3.776219, 236.490949, 10}, {3.815630, 236.469478, 10}, {3.855013, 236.294484, 10}, {3.894341, 235.969223, 10}, {3.933591, 235.498460, 10}, {3.972739, 234.888346, 10}, {4.011763, 234.146256, 10}, {4.050643, 233.280616, 10}, {4.089360, 232.300699, 10}, {4.127896, 231.216417, 10}, {4.166236, 230.038124, 10}, {4.204365, 228.776409, 10}, {4.242272, 227.441911, 10}, {4.279946, 226.045154, 10}, {4.317379, 224.596391, 10}, {4.354563, 223.105491, 10}, {4.391494, 221.581821, 10}, {4.428166, 220.034185, 10}, {4.464578, 218.470749, 10}, {4.500728, 216.899025, 10}, {4.536615, 215.325832, 10}, {4.572241, 213.757312, 10}, {4.607608, 212.198926, 10}, {4.642717, 210.655491, 10}, {4.677572, 209.131190, 10}, {4.712177, 207.629627, 10}, {4.746536, 206.153846, 10}, {4.780654, 204.706400, 10}, {4.814536, 203.289368, 10}, {4.848186, 201.904410, 10}, {4.881612, 200.552811, 10}, {4.914735, 198.739872, 10}, {4.947953, 199.304659, 10}, {4.981390, 200.623793, 10}, {5.015053, 201.977195, 10}, {5.048947, 203.363891, 10}, {5.083077, 204.782587, 10}, {5.117449, 206.231595, 10}, {5.152067, 207.708813, 10}, {5.186936, 209.211667, 10}, {5.222059, 210.737081, 10}, {5.257439, 212.281421, 10}, {5.293079, 213.840472, 10}, {5.328981, 215.409385, 10}, {5.365144, 216.982659, 10}, {5.401570, 218.554120, 10}, {5.438256, 220.116912, 10}, {5.475200, 221.663486, 10}, {5.512398, 223.185640, 10}, {5.549843, 224.674541, 10}, {5.587530, 226.120792, 10}, {5.625449, 227.514502, 10}, {5.663590, 228.845397, 10}, {5.701941, 230.102946, 10}, {5.740487, 231.276508, 10}, {5.779213, 232.355498, 10}, {5.818101, 233.329588, 10}, {5.857132, 234.188888, 10}, {5.896286, 234.924165, 10}, {5.935541, 235.527048, 10}, {5.974873, 235.990221, 10}, {6.014257, 236.307603, 10}, {6.053670, 236.474504, 10}, {6.093084, 236.487755, 10}, {6.132475, 236.345785, 10}, {6.171817, 236.048671, 10}, {6.211083, 235.598132, 10}, {6.250249, 234.997490, 10}, {6.289291, 234.251575, 10}, {6.328186, 233.366608, 10}, {6.366911, 232.350036, 10}, {6.405446, 231.210354, 10}, {6.443772, 229.956904, 10}, {6.481872, 228.599671, 10}, {6.519730, 227.149069, 10}, {6.557333, 225.615748, 10}, {6.594668, 224.010398, 10}, {6.631725, 222.343582, 10}, {6.668496, 220.625584, 10}, {6.704974, 218.866282, 10}, {6.741153, 217.075047, 10}, {6.777030, 215.260659, 10}, {6.812601, 213.431252, 10}, {6.847867, 211.594278, 10}, {6.882827, 209.756488, 10}, {6.917481, 207.923929, 10}, {6.951831, 206.101955, 10}, {6.985880, 204.295253, 10}, {7.019631, 202.507864, 10}, {7.053089, 200.743232, 10}, {7.086256, 199.004233, 10}, {7.119138, 197.293226, 10}, {7.151740, 195.612091, 10}, {7.184067, 193.962279, 10}, {7.216125, 192.344852, 10}, {7.247918, 190.760526, 10}, {7.279453, 189.209707, 10}, {7.310735, 187.692533, 10}, {7.341770, 186.208905, 10}, {7.372563, 184.758518, 10}, {7.403120, 183.340891, 10}, {7.433446, 181.955395, 10}, {7.463546, 180.601269, 10}, {7.493426, 179.277649, 10}, {7.523090, 177.983581, 10}, {7.552543, 176.718039, 10}, {7.581789, 175.479937, 10}, {7.610834, 174.268143, 10}, {7.639681, 173.081491, 10}, {7.668334, 171.918786, 10}, {7.696797, 170.778813, 10}, {7.725074, 169.660346, 10}, {7.753168, 168.562150, 10}, {7.781081, 167.482985, 10}, {7.808818, 166.421614, 10}, {7.836381, 165.376800, 10}, {7.863772, 164.347312, 10}, {7.890994, 163.331925, 10}, {7.918049, 162.329422, 10}, {7.944939, 161.338594, 10}, {7.971665, 160.358239, 10}, {7.998230, 159.387164, 10}, {8.024634, 158.424184, 10}, {8.050879, 157.468120, 10}, {8.076965, 156.517802, 10}, {8.102894, 155.572064, 10}, {8.128665, 154.629744, 10}, {8.154280, 153.689687, 10}, {8.179739, 152.750735, 10}, {8.205041, 151.811736, 10}, {8.230186, 150.871535, 10}, {8.255174, 149.928978, 10}, {8.280004, 148.982907, 10}, {8.304676, 148.032160, 10}, {8.329189, 147.075571, 10}, {8.353541, 146.111969, 10}, {8.377731, 145.140175, 10}, {8.401758, 144.159002, 10}, {8.425619, 143.167257, 10}, {8.449313, 142.163739, 10}, {8.472837, 141.147236, 10}, {8.496190, 140.116531, 10}, {8.519368, 139.070398, 10}, {8.542370, 138.007605, 10}, {8.565191, 136.926916, 10}, {8.587829, 135.827093, 10}, {8.610280, 134.706896, 10}, {8.632541, 133.565091, 10}, {8.654607, 132.400451, 10}, {8.676476, 131.211764, 10}, {8.698142, 129.997836, 10}, {8.719602, 128.757502, 10}, {8.740850, 127.489635, 10}, {8.761882, 126.193153, 10}, {8.782694, 124.867034, 10}, {8.803279, 123.510331, 10}, {8.823632, 122.122187, 10}, {8.843749, 120.701851, 10}, {8.863624, 119.248705, 10}, {8.883251, 117.762280, 10}, {8.902625, 116.242287, 10}, {8.921740, 114.688645, 10}, {8.940590, 113.101512, 10}, {8.959170, 111.481317, 10}, {8.977475, 109.828803, 10}, {8.995499, 108.145061, 10}, {9.013238, 106.431574, 10}, {9.030686, 104.690261, 10}, {9.047840, 102.923521, 10}, {9.064696, 101.134275, 10}, {9.081250, 99.326010, 10}, {9.097501, 97.502823, 10}, {9.113445, 95.669452, 10}, {9.129084, 93.831308, 10}, {9.144416, 91.994494, 10}, {9.159444, 90.165820, 10}, {9.174170, 88.352794, 10}, {9.188597, 86.563606, 10}, {9.202731, 84.807087, 10}, {9.216580, 83.092654, 10}, {9.230152, 81.430223, 10}, {9.243457, 79.830109, 10}, {9.256507, 78.302891, 10}, {9.269317, 76.859267, 10}, {9.281902, 75.509873, 10}, {9.294280, 74.265103, 10}, {9.306468, 73.131881, 10}, {9.318479, 72.066165, 10}, {9.330317, 71.028935, 10}, {9.341989, 70.030777, 10}, {9.353502, 69.078778, 10}, {9.364865, 68.176307, 10}, {9.376086, 67.322936, 10}, {9.387171, 66.514506, 10}, {9.398129, 65.743334, 10}, {9.408962, 64.998547, 10}, {9.419673, 64.269413, 10}, {9.430272, 63.592489, 10}, {9.440772, 63.001840, 10}, {9.451186, 62.483149, 10}, {9.461523, 62.022652, 10}, {9.471791, 61.607307, 10}, {9.481995, 61.224926, 10}, {9.492139, 60.864263, 10}, {9.502225, 60.515072, 10}, {9.512253, 60.168128, 10}, {9.522222, 59.815234, 10}, {9.532131, 59.449190, 10}, {9.541975, 59.063759, 10}, {9.551750, 58.653613, 10}, {9.561453, 58.214271, 10}, {9.571076, 57.742037, 10}, {9.580615, 57.233924, 10}, {9.590063, 56.687590, 10}, {9.599413, 56.101269, 10}, {9.608659, 55.473702, 10}, {9.617793, 54.804078, 10}, {9.626808, 54.091974, 10}, {9.635698, 53.337306, 10}, {9.644455, 52.540270, 10}, {9.653071, 51.701314, 10}, {9.661542, 50.821082, 10}, {9.669858, 49.900389, 10}, {9.678015, 48.940190, 10}, {9.686005, 47.941548, 10}, {9.693823, 46.905613, 10}, {9.701462, 45.833604, 10}, {9.708916, 44.726784, 10}, {9.716181, 43.586460, 10}, {9.723250, 42.413951, 10}, {9.730118, 41.210590, 10}, {9.736781, 39.977719, 10}, {9.743234, 38.716664, 10}, {9.749472, 37.428751, 10}, {9.755491, 36.115284, 10}, {9.761288, 34.777548, 10}, {9.766857, 33.416811, 10}, {9.772196, 32.034313, 10}, {9.777301, 30.631270, 10}, {9.782169, 29.208872, 10}, {9.786797, 27.768282, 10}, {9.791183, 26.310637, 10}, {9.795322, 24.837049, 10}, {9.799213, 23.348598, 10}, {9.802855, 21.846349, 10}, {9.806243, 20.331336, 10}, {9.809377, 18.804574, 10}, {9.812255, 17.267054, 10}, {9.814875, 15.719748, 10}, {9.817236, 14.163610, 10}, {9.819336, 12.599579, 10}, {9.821174, 11.028573, 10}, {9.822749, 9.451501, 10}, {9.824061, 7.873692, 10}, {9.825124, 6.375711, 10}, {9.825963, 5.033896, 10}, {9.826604, 3.849282, 10}, {9.827075, 2.822676, 10}, {9.827401, 1.954673, 10}, {9.827608, 1.245710, 10}, {9.827724, 0.696068, 10}, {9.827775, 0.305927, 10}, {9.827788, 0.075374, 10}, {9.827788, 0.000000, 10}
    };
    private final double[][] rightPoints = new double[][]{
        {0.000019, 0.228043, 10}, {0.000073, 0.324963, 10}, {0.000296, 1.334090, 10}, {0.000691, 2.371859, 10}, {0.001309, 3.706399, 10}, {0.002198, 5.337997, 10}, {0.003409, 7.267099, 10}, {0.004992, 9.494312, 10}, {0.006995, 12.020456, 10}, {0.009470, 14.846574, 10}, {0.012441, 17.825398, 10}, {0.015909, 20.809442, 10}, {0.019875, 23.799600, 10}, {0.024341, 26.796782, 10}, {0.029308, 29.801909, 10}, {0.034778, 32.815917, 10}, {0.040751, 35.839768, 10}, {0.047230, 38.874426, 10}, {0.054217, 41.920889, 10}, {0.061714, 44.980171, 10}, {0.069723, 48.053311, 10}, {0.078246, 51.141368, 10}, {0.087287, 54.245428, 10}, {0.096848, 57.366604, 10}, {0.106932, 60.506033, 10}, {0.117543, 63.664883, 10}, {0.128684, 66.844338, 10}, {0.140358, 70.045622, 10}, {0.152570, 73.269975, 10}, {0.165323, 76.518664, 10}, {0.178622, 79.792976, 10}, {0.192471, 83.094217, 10}, {0.206875, 86.423708, 10}, {0.221839, 89.782787, 10}, {0.237367, 93.172785, 10}, {0.253467, 96.595037, 10}, {0.270142, 100.050864, 10}, {0.287399, 103.541571, 10}, {0.305243, 107.068413, 10}, {0.323682, 110.632614, 10}, {0.342721, 114.235312, 10}, {0.362368, 117.877573, 10}, {0.382628, 121.560337, 10}, {0.403508, 125.284413, 10}, {0.425017, 129.050440, 10}, {0.447160, 132.858845, 10}, {0.469945, 136.709816, 10}, {0.493379, 140.603251, 10}, {0.517469, 144.538705, 10}, {0.542221, 148.515347, 10}, {0.567643, 152.531891, 10}, {0.593741, 156.586543, 10}, {0.620520, 160.676924, 10}, {0.647987, 164.800016, 10}, {0.676146, 168.952078, 10}, {0.705001, 173.128588, 10}, {0.734555, 177.324170, 10}, {0.764810, 181.532536, 10}, {0.795768, 185.746435, 10}, {0.827427, 189.957613, 10}, {0.859787, 194.156792, 10}, {0.892842, 198.333674, 10}, {0.926589, 202.476957, 10}, {0.961018, 206.574407, 10}, {0.996120, 210.612942, 10}, {1.031883, 214.578763, 10}, {1.068293, 218.457530, 10}, {1.105302, 222.058132, 10}, {1.142834, 225.189110, 10}, {1.180807, 227.836977, 10}, {1.219138, 229.991022, 10}, {1.257746, 231.643749, 10}, {1.296544, 232.791198, 10}, {1.335450, 233.433145, 10}, {1.374379, 233.573164, 10}, {1.413248, 233.218538, 10}, {1.451978, 232.380030, 10}, {1.490519, 231.243651, 10}, {1.528851, 229.993234, 10}, {1.566958, 228.638749, 10}, {1.604823, 227.190602, 10}, {1.642433, 225.659438, 10}, {1.679775, 224.055948, 10}, {1.716840, 222.390702, 10}, {1.753619, 220.673992, 10}, {1.790105, 218.915711, 10}, {1.826293, 217.125243, 10}, {1.862178, 215.311386, 10}, {1.897759, 213.482293, 10}, {1.933033, 211.645435, 10}, {1.968001, 209.807583, 10}, {2.002663, 207.974802, 10}, {2.037022, 206.152468, 10}, {2.071079, 204.345282, 10}, {2.104839, 202.557307, 10}, {2.138304, 200.792000, 10}, {2.171480, 199.052254, 10}, {2.204370, 197.340440, 10}, {2.236980, 195.658452, 10}, {2.269314, 194.007753, 10}, {2.301379, 192.389414, 10}, {2.333180, 190.804160, 10}, {2.364722, 189.252405, 10}, {2.396011, 187.734296, 10}, {2.427052, 186.249737, 10}, {2.457852, 184.798430, 10}, {2.488416, 183.379900, 10}, {2.518748, 181.993519, 10}, {2.548854, 180.638532, 10}, {2.578740, 179.314076, 10}, {2.608410, 178.019199, 10}, {2.637869, 176.752878, 10}, {2.667121, 175.514027, 10}, {2.696171, 174.301517, 10}, {2.725024, 173.114182, 10}, {2.753682, 171.950826, 10}, {2.782150, 170.810238, 10}, {2.810432, 169.691189, 10}, {2.838531, 168.592445, 10}, {2.866450, 167.512768, 10}, {2.894192, 166.450918, 10}, {2.921759, 165.405660, 10}, {2.949155, 164.375762, 10}, {2.976382, 163.359999, 10}, {3.003441, 162.357155, 10}, {3.030336, 161.366018, 10}, {3.057067, 160.385387, 10}, {3.083636, 159.414070, 10}, {3.110044, 158.450880, 10}, {3.136293, 157.494640, 10}, {3.162384, 156.544178, 10}, {3.188317, 155.598328, 10}, {3.214093, 154.655930, 10}, {3.239712, 153.715824, 10}, {3.265175, 152.776858, 10}, {3.290481, 151.837875, 10}, {3.315631, 150.897724, 10}, {3.340624, 149.955248, 10}, {3.365458, 149.009290, 10}, {3.390135, 148.058689, 10}, {3.414652, 147.102279, 10}, {3.439008, 146.138888, 10}, {3.463203, 145.167337, 10}, {3.487234, 144.186441, 10}, {3.511100, 143.195007, 10}, {3.534798, 142.191833, 10}, {3.558328, 141.175708, 10}, {3.581685, 140.145414, 10}, {3.604869, 139.099727, 10}, {3.627875, 138.037415, 10}, {3.650701, 136.957241, 10}, {3.673344, 135.857966, 10}, {3.695800, 134.738353, 10}, {3.718067, 133.597166, 10}, {3.740139, 132.433178, 10}, {3.762013, 131.245176, 10}, {3.783685, 130.031967, 10}, {3.805150, 128.792383, 10}, {3.826405, 127.525297, 10}, {3.847443, 126.229625, 10}, {3.868260, 124.904344, 10}, {3.888852, 123.548505, 10}, {3.909212, 122.161246, 10}, {3.929336, 120.741815, 10}, {3.949217, 119.289589, 10}, {3.968851, 117.804094, 10}, {3.988232, 116.285038, 10}, {4.007354, 114.732331, 10}, {4.026212, 113.146125, 10}, {4.044800, 111.526842, 10}, {4.063112, 109.875214, 10}, {4.081144, 108.192323, 10}, {4.098891, 106.479640, 10}, {4.116347, 104.739072, 10}, {4.133509, 102.973002, 10}, {4.150374, 101.184337, 10}, {4.166936, 99.376550, 10}, {4.183195, 97.553717, 10}, {4.199149, 95.720559, 10}, {4.214796, 93.882468, 10}, {4.230137, 92.045528, 10}, {4.245173, 90.216529, 10}, {4.259907, 88.402960, 10}, {4.274342, 86.612992, 10}, {4.288485, 84.855440, 10}, {4.302341, 83.139704, 10}, {4.315921, 81.475688, 10}, {4.329233, 79.873697, 10}, {4.342290, 78.344307, 10}, {4.355107, 76.898211, 10}, {4.367698, 75.546054, 10}, {4.380081, 74.298235, 10}, {4.392275, 73.164711, 10}, {4.404301, 72.154788, 10}, {4.416180, 71.276910, 10}, {4.427936, 70.538467, 10}, {4.439594, 69.945609, 10}, {4.451178, 69.503091, 10}, {4.462714, 69.214152, 10}, {4.474227, 69.080426, 10}, {4.485744, 69.101901, 10}, {4.497290, 69.276920, 10}, {4.508890, 69.602228, 10}, {4.520569, 70.073060, 10}, {4.532350, 70.683263, 10}, {4.544254, 71.425458, 10}, {4.556303, 72.291219, 10}, {4.568515, 73.271274, 10}, {4.580907, 74.355705, 10}, {4.593496, 75.534158, 10}, {4.606296, 76.796042, 10}, {4.619317, 78.130716, 10}, {4.632572, 79.527654, 10}, {4.646068, 80.976599, 10}, {4.659813, 82.467685, 10}, {4.673811, 83.991539, 10}, {4.688068, 85.539360, 10}, {4.702585, 87.102976, 10}, {4.717364, 88.674880, 10}, {4.732405, 90.248246, 10}, {4.747708, 91.816936, 10}, {4.763271, 93.375483, 10}, {4.779091, 94.919078, 10}, {4.795165, 96.443530, 10}, {4.811489, 97.945241, 10}, {4.828059, 99.421158, 10}, {4.844870, 100.868737, 10}, {4.861918, 102.285897, 10}, {4.879197, 103.670976, 10}, {4.896700, 105.022690, 10}, {4.914379, 106.071809, 10}, {4.932091, 106.270945, 10}, {4.949583, 104.951699, 10}, {4.966849, 103.598186, 10}, {4.983884, 102.211366, 10}, {5.000683, 100.792545, 10}, {5.017240, 99.343402, 10}, {5.033551, 97.866046, 10}, {5.049612, 96.363045, 10}, {5.065418, 94.837480, 10}, {5.080967, 93.292979, 10}, {5.096256, 91.733766, 10}, {5.111283, 90.164685, 10}, {5.126049, 88.591235, 10}, {5.140552, 87.019594, 10}, {5.154795, 85.456623, 10}, {5.168780, 83.909864, 10}, {5.182511, 82.387526, 10}, {5.195994, 80.898439, 10}, {5.209236, 79.452006, 10}, {5.222246, 78.058116, 10}, {5.235033, 76.727045, 10}, {5.247612, 75.469327, 10}, {5.259994, 74.295606, 10}, {5.272197, 73.216466, 10}, {5.284237, 72.242241, 10}, {5.296135, 71.382821, 10}, {5.307909, 70.647437, 10}, {5.319583, 70.044467, 10}, {5.331180, 69.581228, 10}, {5.342724, 69.263800, 10}, {5.354240, 69.096874, 10}, {5.365754, 69.083621, 10}, {5.377292, 69.225612, 10}, {5.388879, 69.522769, 10}, {5.400541, 69.973373, 10}, {5.412303, 70.574102, 10}, {5.424190, 71.320123, 10}, {5.436224, 72.205215, 10}, {5.448428, 73.221929, 10}, {5.460822, 74.361769, 10}, {5.473424, 75.615389, 10}, {5.486253, 76.972804, 10}, {5.499324, 78.423596, 10}, {5.512650, 79.957114, 10}, {5.526244, 81.562666, 10}, {5.540115, 83.229687, 10}, {5.554273, 84.947891, 10}, {5.568724, 86.707398, 10}, {5.583474, 88.498837, 10}, {5.598526, 90.313426, 10}, {5.613884, 92.143029, 10}, {5.629547, 93.980194, 10}, {5.645517, 95.818170, 10}, {5.661792, 97.650909, 10}, {5.678371, 99.473055, 10}, {5.695251, 101.279923, 10}, {5.712429, 103.067469, 10}, {5.729901, 104.832252, 10}, {5.747662, 106.571393, 10}, {5.765710, 108.282537, 10}, {5.784037, 109.963800, 10}, {5.802639, 111.613732, 10}, {5.821511, 113.231273, 10}, {5.840647, 114.815707, 10}, {5.860041, 116.366626, 10}, {5.879689, 117.883895, 10}, {5.899583, 119.367611, 10}, {5.919720, 120.818081, 10}, {5.940092, 122.235785, 10}, {5.960696, 123.621354, 10}, {5.981525, 124.975547, 10}, {6.002575, 126.299229, 10}, {6.023841, 127.593356, 10}, {6.045317, 128.858952, 10}, {6.067000, 130.097105, 10}, {6.088885, 131.308945, 10}, {6.110967, 132.495640, 10}, {6.133244, 133.658385, 10}, {6.155710, 134.798395, 10}, {6.178363, 135.916896, 10}, {6.201199, 137.015124, 10}, {6.224215, 138.094317, 10}, {6.247407, 139.155715, 10}, {6.270774, 140.200553, 10}, {6.294312, 141.230062, 10}, {6.318020, 142.245469, 10}, {6.341894, 143.247989, 10}, {6.365934, 144.238833, 10}, {6.390137, 145.219202, 10}, {6.414503, 146.190289, 10}, {6.439028, 147.153280, 10}, {6.463713, 148.109352, 10}, {6.488556, 149.059677, 10}, {6.513557, 150.005420, 10}, {6.538715, 150.947743, 10}, {6.564030, 151.887804, 10}, {6.589501, 152.826756, 10}, {6.615129, 153.765754, 10}, {6.640913, 154.705952, 10}, {6.666854, 155.648505, 10}, {6.692953, 156.594571, 10}, {6.719211, 157.545311, 10}, {6.745628, 158.501891, 10}, {6.772205, 159.465483, 10}, {6.798945, 160.437265, 10}, {6.825848, 161.418424, 10}, {6.852916, 162.410153, 10}, {6.880152, 163.413654, 10}, {6.907557, 164.430137, 10}, {6.935134, 165.460820, 10}, {6.962885, 166.506929, 10}, {6.990813, 167.569695, 10}, {7.018922, 168.650355, 10}, {7.047213, 169.750147, 10}, {7.075692, 170.870310, 10}, {7.104360, 172.012078, 10}, {7.133223, 173.176677, 10}, {7.162284, 174.365321, 10}, {7.191547, 175.579202, 10}, {7.221017, 176.819484, 10}, {7.250698, 178.087297, 10}, {7.280596, 179.383721, 10}, {7.310714, 180.709777, 10}, {7.341058, 182.066411, 10}, {7.371634, 183.454483, 10}, {7.402447, 184.874741, 10}, {7.433501, 186.327804, 10}, {7.464804, 187.814140, 10}, {7.496359, 189.334038, 10}, {7.528174, 190.887579, 10}, {7.560253, 192.474605, 10}, {7.592602, 194.094685, 10}, {7.625227, 195.747077, 10}, {7.658132, 197.430691, 10}, {7.691322, 199.144041, 10}, {7.724803, 200.885210, 10}, {7.758579, 202.651800, 10}, {7.792652, 204.440888, 10}, {7.827027, 206.248986, 10}, {7.861706, 208.072000, 10}, {7.896690, 209.905191, 10}, {7.931980, 211.743150, 10}, {7.967577, 213.579772, 10}, {8.003478, 215.408249, 10}, {8.039682, 217.221074, 10}, {8.076183, 219.010058, 10}, {8.112978, 220.766370, 10}, {8.150058, 222.480598, 10}, {8.187415, 224.142824, 10}, {8.225039, 225.742737, 10}, {8.262917, 227.269758, 10}, {8.301036, 228.713193, 10}, {8.339380, 230.062406, 10}, {8.377931, 231.307007, 10}, {8.416669, 232.427383, 10}, {8.455542, 233.239547, 10}, {8.494470, 233.567183, 10}, {8.533370, 233.399708, 10}, {8.572158, 232.730035, 10}, {8.610751, 231.554797, 10}, {8.649063, 229.874419, 10}, {8.687012, 227.693059, 10}, {8.724515, 225.018395, 10}, {8.761492, 221.861298, 10}, {8.797866, 218.245183, 10}, {8.833593, 214.361520, 10}, {8.868658, 210.391581, 10}, {8.903050, 206.349683, 10}, {8.936758, 202.249585, 10}, {8.969776, 198.104326, 10}, {9.002097, 193.926096, 10}, {9.033718, 189.726137, 10}, {9.064637, 185.514698, 10}, {9.094854, 181.300998, 10}, {9.124369, 177.093237, 10}, {9.153186, 172.898614, 10}, {9.181306, 168.723367, 10}, {9.208735, 164.572823, 10}, {9.235477, 160.451462, 10}, {9.261537, 156.362984, 10}, {9.286922, 152.310373, 10}, {9.311638, 148.295972, 10}, {9.335692, 144.321551, 10}, {9.359090, 140.388366, 10}, {9.381840, 136.497227, 10}, {9.403948, 132.648562, 10}, {9.425421, 128.842456, 10}, {9.446268, 125.078704, 10}, {9.466494, 121.356872, 10}, {9.486107, 117.676308, 10}, {9.505113, 114.036198, 10}, {9.523519, 110.435590, 10}, {9.541331, 106.873421, 10}, {9.558556, 103.348540, 10}, {9.575199, 99.859731, 10}, {9.591267, 96.405723, 10}, {9.606764, 92.985223, 10}, {9.621697, 89.596904, 10}, {9.636070, 86.239428, 10}, {9.649889, 82.911467, 10}, {9.663157, 79.611681, 10}, {9.675880, 76.338756, 10}, {9.688062, 73.091384, 10}, {9.699707, 69.868272, 10}, {9.710818, 66.668166, 10}, {9.721400, 63.489818, 10}, {9.731455, 60.332011, 10}, {9.740988, 57.193561, 10}, {9.750000, 54.073300, 10}, {9.758495, 50.970094, 10}, {9.766475, 47.882834, 10}, {9.773944, 44.810428, 10}, {9.780902, 41.751824, 10}, {9.787353, 38.705982, 10}, {9.793299, 35.671890, 10}, {9.798740, 32.648555, 10}, {9.803679, 29.635005, 10}, {9.808118, 26.630286, 10}, {9.812057, 23.633462, 10}, {9.815497, 20.643611, 10}, {9.818441, 17.659823, 10}, {9.820889, 14.689469, 10}, {9.822869, 11.880016, 10}, {9.824431, 9.370484, 10}, {9.825624, 7.159833, 10}, {9.826498, 5.247269, 10}, {9.827104, 3.632177, 10}, {9.827489, 2.314141, 10}, {9.827705, 1.292860, 10}, {9.827800, 0.568172, 10}, {9.827823, 0.139981, 10}, {9.827823, 0.000000, 10}
    };
}