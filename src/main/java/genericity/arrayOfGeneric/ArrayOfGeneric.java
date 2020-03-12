package genericity.arrayOfGeneric;

import genericity.Generator;

/**
 * @author 10745
 * @date 2020/3/1 14:40
 **/
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generator<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // gia = (Generator<Integer>[]) new Object[SIZE];

        gia = (Generator<Integer>[]) new Generic[SIZE];

        System.out.println(gia.getClass().getSimpleName());
        gia[0] = (Generator<Integer>) new Generic<Integer>();
        // gia[1] = new Object();
        // gia[2] = new Generic<Double>();
    }
}

class Generic<T> {
}
