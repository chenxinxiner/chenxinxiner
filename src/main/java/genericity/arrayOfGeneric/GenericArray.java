package genericity.arrayOfGeneric;

import org.omg.CORBA.Object;

/**
 * 成功创建泛型数组的唯一方式就是创建一个被擦除类型的数组，然后让其转型
 *
 * @author 10745
 * @date 2020/3/2 10:54
 **/
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
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
        GenericArray<Integer> integerGenericArray = new GenericArray<Integer>(10);
        final Integer[] rep1 = integerGenericArray.rep();
        java.lang.Object[] rep = integerGenericArray.rep();
        System.out.println();
    }
}
