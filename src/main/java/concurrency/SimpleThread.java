package concurrency;

/**
 * 简单的任务线程，继承Thread类，然后重写run方法
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/14 9:56
 * @modified By：
 * @version: $
 */
public class SimpleThread extends Thread {

    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
