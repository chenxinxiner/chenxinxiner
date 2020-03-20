package InitializationAndCleanup.initialize;

/**
 * static域初始化
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-20 10:31
 * @description：static域初始化
 * @modified By：
 * @version: $
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }

}

class Cup {
    public Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2 = new Cup(2);

    static {
        cup1 = new Cup(1);
        // cup2 = new Cup(2);
    }

    public Cups() {
        System.out.println("Cups()");
    }
}
