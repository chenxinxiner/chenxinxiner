package enumStudy;

import java.text.DateFormat;
import java.time.LocalDateTime;

/**
 * @author chenxinxiner
 */

public enum ConstantSpecificMethod {
    DATE_TIME {
        String getInfo() {
            return LocalDateTime.now().toString();
        }
    },
    CLASSPATH {
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    abstract String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod csm : values()) {
            System.out.println(csm.getInfo());

        }
    }
}
