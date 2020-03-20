package InitializationAndCleanup.initialize;

import java.util.Arrays;
import java.util.Random;

/**
 * @author ：chenxin
 * @date ：Created in 2020-03-20 11:51
 * @description：
 * @modified By：
 * @version: $
 */
public class ArratNew {
    public static void main(String[] args) {
        int[] a;
        Random random = new Random(47);
        System.out.println(random.nextInt(10));
        a = new int[random.nextInt(20)];
        int[] b = new int[random.nextInt(60)];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
