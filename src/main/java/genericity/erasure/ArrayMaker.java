package genericity.erasure;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 10745
 * @date 2020/2/24 15:25
 **/
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] creat(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<String>(String.class);
        String[] creats = stringArrayMaker.creat(9);
        System.out.println(Arrays.toString(creats));
    }
}
