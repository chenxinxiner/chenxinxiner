package InitializationAndCleanup.thisKeyWord;

/**
 * this 的用法
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-18 15:21
 * @description：this 的用法
 * @modified By：
 * @version: $
 */
public class Leaf {

    int i;

    Leaf getLeaf() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        final Leaf leaf = new Leaf();
        leaf.getLeaf().getLeaf().getLeaf().getLeaf().print();
    }

}
