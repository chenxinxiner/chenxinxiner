package concurrency.threadTermination;

import concurrency.SleepingTask;
import enumStudy.Input;
import org.omg.CORBA.TIMEOUT;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 中断Executor产生的线程池中的某一个线程或者全部线程
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/18 22:25
 * @modified By：
 * @version: $
 */
public class Interrupting {
    private static ExecutorService exec = Executors.newCachedThreadPool();

    static void test(Runnable r) throws InterruptedException {
        Future<?> submit = exec.submit(r);
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting " + r.getClass().getName());
        submit.cancel(true);
        System.out.println("Interrupt sent to " + r.getClass().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        test(new SleepBlocked());
        test(new IOBlocked(System.in));
        test(new SynchronizedBlocked());
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Aborting with System.exit(0)");
        System.exit(0);
    }
}

class SleepBlocked implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("Exiting SleepBlock.run()");
    }
}

class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream in) {
        this.in = in;
    }

    @Override
    public void run() {
        try {
            System.out.println("Waiting for read()|");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException();
            }
        }
    }
}

class SynchronizedBlocked implements Runnable {
    public synchronized void f() {
        Thread.yield();
    }

    public SynchronizedBlocked() {
        new Thread(this::f).start();
    }

    @Override
    public void run() {
        System.out.println("trying to call f()");
        f();
        System.out.println("Exiting SynchronizedBolcked.run()");
    }
}
