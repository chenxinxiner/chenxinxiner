package genericity.constructingComplexModel;

import genericity.ThreeTuple;
import genericity.TwoTuple;

import java.util.ArrayList;

/**
 * @author 10745
 * @date 2020/2/22 10:55
 **/
public class TupleList<A, B> extends ArrayList<TwoTuple<A, B>> {
    public static void main(String[] args) {
        TupleList<String, Integer> twoTuples = new TupleList<String, Integer>();
        twoTuples.add(new TwoTuple<String, Integer>("sss", 34));
        twoTuples.add(new TwoTuple<String, Integer>("zzz", 12));

        for (TwoTuple t : twoTuples) {
            System.out.println(t);
        }
    }
}
