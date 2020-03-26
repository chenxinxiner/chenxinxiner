package JVM;

/**
 * java栈 -Xss 设置最大栈值
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 12:51
 * @description：java栈 -Xss 设置最大栈值
 * @modified By：
 * @version: $
 */
public class JavaStackTest {
    int count = 0;

    public static void main(String[] args) {
        new JavaStackTest().f();
    }

    void f() {
        count++;
        System.out.println(count);
        f();
    }
}
