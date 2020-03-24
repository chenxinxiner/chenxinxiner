package typeInfo.use;


import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

class MyTaskTest {

    @Test
    void run() {
        Timer timer = new Timer();
        Calendar now = Calendar.getInstance();
        now.set(Calendar.SECOND, now.get(Calendar.SECOND) + 1);
        Date time = now.getTime();
        MyTask myTask = new MyTask();

        timer.scheduleAtFixedRate(myTask, time, 3000);

    }
}