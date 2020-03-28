package JVM.gc.reference;

/**
 * 强引用测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 14:32
 * @description：强引用测试
 * @modified By：
 * @version: $
 */
public class StrongReferenceTest {

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            s1.append("00000000000000000000");
        }
        StringBuilder s2 = s1;
        //s1为null但是s2依然占据着内存
        s1 = null;
        // s2 = null;
        System.gc();
        //垃圾回收，当时不能回收强类型的引用，内存被占用 ，下面语句报错

        final byte[] bytes = new byte[1024 * 1024 * 3];

    }
}
