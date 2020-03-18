package concurrency;

/**
 * @author ：chenxin
 * @date ：Created in 2020/3/16 22:17
 * @modified By：
 * @version: $
 */
public class SyncObject {
    public static void main(String[] args) {
        final DualSynch dualSynch = new DualSynch();
        new Thread() {

            public void run() {
                dualSynch.f();
            }
        }.start();
        dualSynch.g();
    }
}

class DualSynch {
    private Object syncObject = new Object();

    public synchronized void f() {
        for (int i = 0; i < 5; i++) {
            System.out.println("f()");
            Thread.yield();
        }
    }

    public void g() {
        synchronized (syncObject) {
            for (int i = 0; i < 5; i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}
