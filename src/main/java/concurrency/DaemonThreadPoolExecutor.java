package concurrency;

import java.util.concurrent.*;

/**
 * @author 10745
 * @date 2020/3/13 23:07
 **/
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {

    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DeamonThreadFactory());
    }
}
