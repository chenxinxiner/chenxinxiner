package genericity.arrayOfGeneric;

import java.lang.reflect.Array;

/**
 * @author 10745
 * @date 2020/3/2 11:35
 **/
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        final GenericArrayWithTypeToken<Integer> integerGenericArrayWithTypeToken = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
        final Integer[] rep = integerGenericArrayWithTypeToken.rep();
    }
}
