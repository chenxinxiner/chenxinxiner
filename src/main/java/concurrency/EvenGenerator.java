package concurrency;

/**
 * 整数生成器实现
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/15 15:47
 * @modified By：
 * @version: $
 */
public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    /**
     * 这个方法添加synchronized即可正常工作
     *
     * @return int
     * @author chenxin
     * @date 2020/3/15 16:41
     * @version 1.0
     **/
    @Override
    public int next() {
        //Danger point here
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
