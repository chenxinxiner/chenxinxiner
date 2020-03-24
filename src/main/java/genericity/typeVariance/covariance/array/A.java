package genericity.typeVariance.covariance.array;

/**
 * java的数组是协变得
 * <p>
 * String是Object得子类，那么String[]是Object[]得子类
 */
public class A {
    public static void main(String[] args) {
        B[] bs = new B[1];
        bs[0] = new B();
        A[] as = bs;
        try {
            //原始类型是B，父类不能转换子类
            as[0] = new A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            as[0] = new C();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class B extends A {
}

class C extends B {
}
