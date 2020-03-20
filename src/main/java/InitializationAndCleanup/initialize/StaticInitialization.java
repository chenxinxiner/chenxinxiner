package InitializationAndCleanup.initialize;

/**
 * 静态资源初始化
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-19 15:52
 * @description：静态资源初始化
 * @modified By：
 * @version: $
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard");
        new Cupboard();
        System.out.println("main creating new Cupboard");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

class Bow1 {
    public Bow1(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Table {
    static Bow1 bow1 = new Bow1(1);

    public Table() {
        System.out.println("Table");

    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bow1 bow2 = new Bow1(2);
}

class Cupboard {
    Bow1 bow3 = new Bow1(3);
    static Bow1 bow4 = new Bow1(4);

    public Cupboard() {
        System.out.println("Cupboard");
        bow4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

}