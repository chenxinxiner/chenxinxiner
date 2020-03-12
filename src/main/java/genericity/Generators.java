package genericity;

import java.util.Collection;

/**
 * @author 10745
 * @date 2020/2/22 10:38
 **/
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }
}
