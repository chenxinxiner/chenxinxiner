package genericity.typeVariance.method;

/**
 * Java数据类型变化
 * <p>
 * 方法情况
 * JDK1.4重写的方法参数和返回值要求一样
 * JDK1.5+ 重写的方法，参数要求一样，返回值是协变的
 */
public class Father {
    public static void main(String[] args) {
        Father father = new Son();
        father.f1(new B());
    }

    public B f1(B obj) {
        System.out.printf("father.f1()");
        return new B();
    }

}

class Son extends Father {
    // public B f1(B obj) {
    public C f1(B obj) {
        System.out.printf("son.f1()");
        return new C();
    }
}

class A {

}

class B extends A {
}

class C extends B {
}