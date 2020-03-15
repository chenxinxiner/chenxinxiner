package concurrency;

/**
 * @author 10745
 * @date 2020/3/13 21:11
 **/
public class MainThread {
    public static void main(String[] args) {
        final LiftOff liftOff =new LiftOff();
        liftOff.run();
    }
}
