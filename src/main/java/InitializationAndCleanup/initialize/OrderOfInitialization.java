package InitializationAndCleanup.initialize;

/**
 * 变量的初始化都在方法之前
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-19 15:11
 * @description：变量的初始化都在方法之前
 * @modified By：
 * @version: $
 */
public class OrderOfInitialization {

    public static void main(String[] args) {
        final House house = new House();
        house.f();
    }
}

class Window {
    Window(int n) {
        System.out.println("Window" + n);
    }
}

class House {
    Window w = new Window(1);

    public House() {
        System.out.println("House()");
        w = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}
