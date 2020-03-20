package InitializationAndCleanup.thisKeyWord;

/**
 * this测试 有意思
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-18 15:28
 * @description：this测试 有意思
 * @modified By：
 * @version: $
 */
public class Apple {

    Apple peel() {
        //有点类似建造者模式。装饰器模式
        return Peeler.peeler(this);
    }

    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

}

class Peeler {
    static Apple peeler(Apple apple) {
        //peeler
        return apple;
    }
}

class Person {
    void eat(Apple a) {
        Apple peel = a.peel();
        System.out.println("Yummy");
    }
}
