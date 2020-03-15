package concurrency;

/**
 * 整数生成器
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/15 15:32
 * @modified By：
 * @version: $
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancle() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}

