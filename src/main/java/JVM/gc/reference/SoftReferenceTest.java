package JVM.gc.reference;

import java.lang.ref.SoftReference;

/**
 * 软引用测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 14:38
 * @description：软引用测试
 * @modified By：
 * @version: $
 */
public class SoftReferenceTest {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            s1.append("0000");
        }

        SoftReference<StringBuilder> s2 = new SoftReference<StringBuilder>(s1);

        s1 = null;

        System.out.println(s2.get().length());

        System.gc();
        //软引用，内存不紧张，则不会回收
        System.out.println(s2.get().length());

        final byte[] bytes = new byte[(int) (1024 * 1024 * 3)];

        System.gc();

        System.out.println(s2.get() == null);

    }
}
