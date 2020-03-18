package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ：chenxin
 * @date ：Created in 2020/3/16 20:39
 * @modified By：
 * @version: $
 */
public class AtomicEvenGenerator extends IntGenerator {
    private AtomicInteger currtEvenValue = new AtomicInteger(0);

    @Override
    public int next() {
        return currtEvenValue.addAndGet(2);
    }

    public static void main(String[] args) {
        EvenChecker.test(new AtomicEvenGenerator());
    }
}
