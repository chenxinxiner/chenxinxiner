package InitializationAndCleanup.thisKeyWord;

/**
 * @author ：chenxin
 * @date ：Created in 2020-03-18 15:38
 * @description：
 * @modified By：
 * @version: $
 */
public class Flower {
    int petaCount = 0;
    String s = "initial value";

    public Flower(int petaCount) {
        this.petaCount = petaCount;
    }

    public Flower(String s) {
        // 必须先调用构造器
        // s = "asd";
        this.s = s;
    }

    public Flower(int petaCount, String s) {
        this(petaCount);
        this.s = s;
    }

    public Flower() {
        this(45, "qwertyuiop");
    }

    @Override
    public String toString() {
        //编译器不允许再构造器之外的方法调用构造器
        // this(123, "sd");
        System.out.println("count = " + petaCount + " s = " + s);
        return "count = " + petaCount + " s = " + s;
    }

    public static void main(String[] args) {
        final Flower flower = new Flower();
        flower.toString();
        final Flower flower2 = new Flower(123);
        final Flower flower3 = new Flower("lllll");
        final Flower flower4 = new Flower(12, "poi");
        flower2.toString();
        flower3.toString();
        flower4.toString();

    }
}
