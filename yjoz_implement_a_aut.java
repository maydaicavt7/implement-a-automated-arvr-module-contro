import java.util.*;

public class yjoz_implement_a_aut {

    // Configuration variables
    public static final String MODULE_NAME = "AR/VR Module Controller";
    public static final int MODULE_VERSION = 1;
    public static final boolean DEBUG_MODE = true;

    // Module settings
    public static final int SENSOR_POLL_RATE = 100; // ms
    public static final int COMMAND_SEND_RATE = 50; // ms
    public static final int MAX_SENSOR_DATA_BUFFER = 1000;

    // Sensor configurations
    public static final List<String> SENSOR_TYPES = Arrays.asList("accelerometer", "gyroscope", "magnetometer");
    public static final Map<String, Integer> SENSOR_RESOLUTION = new HashMap<String, Integer>() {{
        put("accelerometer", 16);
        put("gyroscope", 16);
        put("magnetometer", 16);
    }};

    // Command configurations
    public static final List<String> COMMAND_TYPES = Arrays.asList("move_forward", "move_backward", "turn_left", "turn_right");
    public static final Map<String, Integer> COMMAND_PRIORITIES = new HashMap<String, Integer>() {{
        put("move_forward", 3);
        put("move_backward", 2);
        put("turn_left", 1);
        put("turn_right", 1);
    }};

    // Output configurations
    public static final List<String> OUTPUT_DEVICES = Arrays.asList("head_mounted_display", "speaker");
    public static final Map<String, Integer> OUTPUT_PRIORITIES = new HashMap<String, Integer>() {{
        put("head_mounted_display", 2);
        put("speaker", 1);
    }};
}