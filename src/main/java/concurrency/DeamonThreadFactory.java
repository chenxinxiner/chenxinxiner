package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * @author 10745
 * @date 2020/3/13 22:57
 **/
public class DeamonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setDaemon(true);
        return thread;
    }
}
