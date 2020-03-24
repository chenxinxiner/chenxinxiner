package genericity.typeVariance;

import java.util.ArrayList;

/**
 * 复合情况
 * 数组协变，泛型不变
 */
public class Fix {

    public static void testArrayAndList() {
        // B[] b1 = test(new ArrayList<B>());
        A[] a1 = test(new ArrayList<B>());
        // Object[] test = test(new ArrayList<Object>());
        A[] a4 = test(new ArrayList<A>());
        Object[] a5 = test(new ArrayList<A>());

    }

    public static A[] test(ArrayList<? extends A> list) {
        return new A[1];
    }

}

class A {
}

class B extends A {
}

class C extends B {
}
