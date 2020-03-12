package genericity;

/**
 * 泛型方法
 *
 * @author 10745
 * @date 2020/2/21 18:19
 **/
public class GenericMethods {
    public <T> void f(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public <T, A, B> void f(T t, A a, B b) {
        System.out.println(t.getClass().getSimpleName());
        System.out.println(a.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        final GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(123);
        genericMethods.f(123.1);
        genericMethods.f("123");
        genericMethods.f('c');
        genericMethods.f(genericMethods);

        genericMethods.f("ssad", 12, 123.32);
    }
}