package InitializationAndCleanup.initialize;

/**
 * @author ：chenxin
 * @date ：Created in 2020-03-20 11:26
 * @description：
 * @modified By：
 * @version: $
 */
public class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    public Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int marker) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}

class Mug {
    public Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
}
