package genericity;

/**
 * 三元组  利用继承机制实现长度更长的元祖
 *
 * @author 10745
 * @date 2020/2/20 13:29
 **/
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {

    public final C third;

    public ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "ThreeTuple{" +
                "third=" + third +
                ", first=" + first +
                ", second=" + second +
                '}';
    }
}

