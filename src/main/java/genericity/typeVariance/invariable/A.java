package genericity.typeVariance.invariable;

import java.util.ArrayList;

/**
 * java的（原始的）泛型是不变的大
 * <p>
 * String是Object得子类，List<String>和List<Object>没有关系
 * <p>
 * 泛型可采用通配符支持协变和逆变(PECS原则)
 */
public class A {
    public static void main(String[] args) {
        ArrayList<B> bArrayList = new ArrayList<>();
        bArrayList.add(new B());
        //compile error
        // ArrayList<A> aArrayList = bArrayList;

        //协变
        // B 继承A
        // 有ArrayList<B> “继承”ArrayList<? extends A>
        ArrayList<? extends A> arrayList2 = new ArrayList<B>();
        //逆变
        // B 继承A
        // 有ArrayList<A> “继承”ArrayList<? extends B>
        ArrayList<? super B> arrayList3 = new ArrayList<A>();
    }
}

class B extends A {
}

class C extends B {
}
