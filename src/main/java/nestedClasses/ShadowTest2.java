package nestedClasses;

/**
 * 变量遮蔽测试
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/24 21:21
 * @description：变量遮蔽测试
 * @modified By：
 * @version: $
 */
public class ShadowTest2 {
    private int x = 0;

    public void f1() {
        int x = 20;//局部内部类无法访问
        class FirstLevel {
            public int x = 1;

            public void methodInFirstLevel(int x) {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("ShadowTest.this.x = " + ShadowTest2.this.x);
            }
        }
    }

}
