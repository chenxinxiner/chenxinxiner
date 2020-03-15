package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author 10745
 * @date 2020/3/13 23:34
 **/
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        final Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon());
        TimeUnit.MILLISECONDS.sleep(100);
    }
}

class Daemon implements Runnable {
    private Thread[] threads = new Thread[10];

    @Override
    public void run() {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new DaemonSpawn());
            threads[i].start();
            System.out.println("DaemonSpawn " + i + " started,");
        }
        for (int i = 0; i < threads.length; i++) {
            System.out.print(" t[" + i + "].isDaemon()= " + threads[i].isDaemon());
        }
        while (true) {
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable {
    @Override
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
