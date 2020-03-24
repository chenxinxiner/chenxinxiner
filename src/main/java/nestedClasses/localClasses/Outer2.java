package nestedClasses.localClasses;

/**
 * 局部内部类
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/24 19:15
 * @description：局部内部类
 * @modified By：
 * @version: $
 */
public class Outer2 {

    private String name = "zz";

    public void f1() {

        final String nameIn = "ll";

        class Inner2 {
            String name = "mm";

            public void f1() {
                System.out.println(Outer2.this.name);
                System.out.println(nameIn);
            }
        }
    }
}
