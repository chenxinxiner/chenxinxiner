package JVM;

/**
 * java栈 -Xss 设置最大栈值
 * 添加方法中的参数，查看递归次数
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 12:51
 * @description：java栈 -Xss 设置最大栈值
 * @modified By：
 * @version: $
 */
public class JavaStackTest2 {
    int count = 0;

    public static void main(String[] args) {
        new JavaStackTest2().f();
    }

    void f() {
        long a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
        count++;
        System.out.println(count);
        f();
    }
}
