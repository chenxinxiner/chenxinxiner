package typeInfo.use;

import java.lang.reflect.Method;
import java.util.TimerTask;

/**
 * 动态执行方法
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/23 16:03
 * @description：动态执行方法
 * @modified By：
 * @version: $
 */
public class MyTask extends TimerTask {
    @Override
    public void run() {
        try {
            Method m = Class.forName("Worker").getClass().getMethod("hello");
            //静态方法不用new对象来执行
            m.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Worker {
    public static void hello() {
        System.out.println("Hello world");
    }
}