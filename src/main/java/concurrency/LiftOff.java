package concurrency;

/**
 * @author 10745
 * @date 2020/3/13 21:06
 **/
public class LiftOff implements Runnable {

    protected int countDown = 10;
    private static int tackCount = 0;
    private final int id = tackCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff") + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
