package nestedClasses.anongmousClasses;

/**
 * 内部类1
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/24 18:30
 * @description：内部类1
 * @modified By：
 * @version: $
 */
public class Outer1 {
    public void f1() {
        final String name = "def";
        Runnable runnable = new Runnable() {
            public static final int i = 0;
            // static int j =1;

            public void run() {
                System.out.println("hello" + name);
            }

            // public static void f2() { }
        };

        new Thread(runnable).start();
        System.out.println(runnable.getClass().getSimpleName());

        Runnable hello2 = new Runnable() {

            public void run() {
                System.out.println("hello2");
            }
        };
        new Thread(hello2).start();
        System.out.println(hello2.getClass().getSimpleName());

    }
}
