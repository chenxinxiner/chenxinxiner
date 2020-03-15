package concurrency;

import genericity.Generator;

import javax.lang.model.element.Element;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 共享资源的不正确访问示例
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/15 15:35
 * @modified By：
 * @version: $
 */
public class EvenChecker implements Runnable {

    private IntGenerator generator;

    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 != 0) {
                System.out.println(val + " not even");
                generator.cancle();
            }
        }
    }

    public static void test(IntGenerator generator, int count) {
        System.out.println("Press Control-C to exit ");
        final ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            executorService.execute(new EvenChecker(generator, i));
        }
        executorService.shutdown();
    }

    public static void test(IntGenerator generator) {
        test(generator, 10);
    }
}
