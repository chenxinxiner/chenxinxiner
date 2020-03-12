package genericity.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 10745
 * @date 2020/2/24 16:26
 **/
public class ListMaker<T> {
    List<T> creat() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        final ListMaker<String> stringListMaker = new ListMaker<String>();
        final List<String> creat = stringListMaker.creat();
    }
}
