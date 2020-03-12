package genericity.erasure;

/**
 * @author 10745
 * @date 2020/2/25 15:14
 **/
public class ClassTypeCapture<T> {
    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        final ClassTypeCapture<String> stringClassTypeCapture = new ClassTypeCapture<String>(String.class);

        System.out.println(stringClassTypeCapture.f(new Integer(1)));
        System.out.println(stringClassTypeCapture.f(new String("1")));
        System.out.println(stringClassTypeCapture.f(new Double(1)));
        System.out.println(stringClassTypeCapture.f(new ListMaker<String>()));
    }
}
