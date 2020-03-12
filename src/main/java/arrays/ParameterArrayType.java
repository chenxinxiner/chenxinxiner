package arrays;

import java.util.Arrays;

/**
 * 参数化数组本身的类型
 */
public class ParameterArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5, 6};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] f = new ClassParameter<Integer>().f(ints);
        Double[] f1 = MethodParameter.f(doubles);

        int[] a = new int[10];
        Arrays.fill(a, 1);
        System.out.println(Arrays.toString(a));

    }
}

class ClassParameter<T> {
    public T[] f(T[] arg) {
        return arg;
    }
}

class MethodParameter {
    public static <T> T[] f(T[] arg) {
        return arg;
    }
}
