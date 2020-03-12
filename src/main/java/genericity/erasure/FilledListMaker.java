package genericity.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10745
 * @date 2020/2/24 16:29
 **/
public class FilledListMaker<T> {

    List<T> ceate(T t, int n) {
        final ArrayList<T> ts = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            ts.add(t);
        }
        return ts;
    }

    public static void main(String[] args) {
        final FilledListMaker<String> stringFilledListMaker = new FilledListMaker<String>();
        final List<String> hello = stringFilledListMaker.ceate("hello", 4);
        System.out.println(hello);
    }
}
