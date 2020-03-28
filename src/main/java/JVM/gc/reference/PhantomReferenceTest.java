package JVM.gc.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 虚引用测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 15:01
 * @description：虚引用测试
 * @modified By：
 * @version: $
 */
public class PhantomReferenceTest {
    public static void main(String[] args) {
        ReferenceQueue<StringBuilder> queue = new ReferenceQueue<StringBuilder>();
        // final CheckReferenceQueue checkReferenceQueue = new CheckReferenceQueue(queue);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            s1.append("00000000000");
        }

        // PhantomReference<StringBuilder> s2 = new PhantomReference<StringBuilder>(s1);

        s1 = null;
    }
}
