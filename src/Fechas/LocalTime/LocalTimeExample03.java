package Fechas.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample03 {
    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        LocalTime date = base.plusHours(5);
        if (date.getHour() == 20) {
            return base.plusHours(4);
        } else
            return base.plusHours(5);


    }
}
