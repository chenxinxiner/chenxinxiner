package enumStudy;

import java.util.EnumMap;
import java.util.Map;

interface Commond {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Commond> em = new EnumMap<AlarmPoints, Commond>(AlarmPoints.class);
        em.put(AlarmPoints.KITCHEN, new Commond() {
            public void action() {
                System.out.println("Kitchen fire!");
            }
        });
        em.put(AlarmPoints.BATCHROOM, new Commond() {
            public void action() {
                System.out.println("Bathroom alert!");
            }
        });
        for (Map.Entry<AlarmPoints, Commond> e : em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(AlarmPoints.UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
