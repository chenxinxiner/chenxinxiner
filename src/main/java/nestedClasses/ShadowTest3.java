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
public class ShadowTest3 {
    private int x = 0;

    public void f1() {
        //可以访问到，没有被遮蔽
        int x = 20;
        class FirstLevel {
            public int x = 1;

            public void methodInFirstLevel() {
                System.out.println("x = " + x);
                System.out.println("ShadowTest.this.x = " + ShadowTest3.this.x);
            }
        }
    }

}
