package genericity.erasure;

/**
 * 泛型丢失的类型操作能力
 *
 * @author 10745
 * @date 2020/2/25 15:09
 **/
public class Erased<T> {
    private final int SIZE = 100;

    public void f(Object arg) {/*
        if (arg instanceof T) {
        }
        T t = new T();
        T[] ts = new T[SIZE];*/
        T[] objects = (T[]) new Object[SIZE];
    }

}
