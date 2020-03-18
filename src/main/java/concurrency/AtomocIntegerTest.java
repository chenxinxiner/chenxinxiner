package concurrency;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 原子类测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/16 20:28
 * @modified By：
 * @version: $
 */
public class AtomocIntegerTest implements Runnable {

    private AtomicInteger i = new AtomicInteger(0);

    public int getValue() {
        return i.get();
    }

    private void evenIncrement() {
        i.addAndGet(2);
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Aborting");
                System.exit(0);
            }
        }, 5000);
        final ExecutorService executorService = Executors.newCachedThreadPool();
        final AtomocIntegerTest atomocIntegerTest = new AtomocIntegerTest();
        executorService.execute(atomocIntegerTest);
        while (true) {
            int val = atomocIntegerTest.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
