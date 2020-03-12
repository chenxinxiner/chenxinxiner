package genericity.arrayOfGeneric;

/**
 * @author 10745
 * @date 2020/3/2 11:10
 **/
public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int sz) {
        array = new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = index;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T[]) array;
    }

    public static void main(String[] args) {
        final GenericArray2<Integer> integerGenericArray2 = new GenericArray2<Integer>(10);
        for (int i = 0; i < 10; i++) {
            integerGenericArray2.put(i, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(integerGenericArray2.get(i));
        }
        System.out.println();
        try {
            final Integer[] rep = integerGenericArray2.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
