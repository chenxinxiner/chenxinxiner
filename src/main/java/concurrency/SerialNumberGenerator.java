package concurrency;

/**
 * @author ：chenxin
 * @date ：Created in 2020/3/15 18:16
 * @modified By：
 * @version: $
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++;
    }
}
