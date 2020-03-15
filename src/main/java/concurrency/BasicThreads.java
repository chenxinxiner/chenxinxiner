package concurrency;

/**
 * @author 10745
 * @date 2020/3/13 21:15
 **/
public class BasicThreads {
    public static void main(String[] args) {
        final Thread thread = new Thread(new LiftOff());
        thread.start();
        System.out.print("Waiting for LifeOff");

    }
}

class MoreBasicThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread((new LiftOff())).start();
        }
        System.out.println("Waiting for LifeOff");
    }
}
