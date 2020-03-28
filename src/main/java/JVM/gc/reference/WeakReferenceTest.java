package JVM.gc.reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 弱引用测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 14:51
 * @description：弱引用测试
 * @modified By：
 * @version: $
 */
public class WeakReferenceTest {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            s1.append("00000000000");
        }

        WeakReference<StringBuilder> s2 = new WeakReference<StringBuilder>(s1);

        s1 = null;

        System.out.println(s2.get().length());
        //弱引用只要gc就会被回收
        System.gc();
        System.out.println(s2 == null);
        Byte[] bytes = new Byte[(int) (1024 * 1024 * 3.5)];


    }
}
