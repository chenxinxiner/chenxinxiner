package genericity;

/**
 * 更通用的泛型元祖
 *
 * @author 10745
 * @date 2020/2/21 21:28
 **/
public class Tuple {

    public static <A, B> TwoTuple tuple(A a, B b) {
        return new TwoTuple(a, b);
    }

    public static <A, B, C> ThreeTuple tuple(A a, B b, C c) {
        return new ThreeTuple(a, b, c);
    }


}
