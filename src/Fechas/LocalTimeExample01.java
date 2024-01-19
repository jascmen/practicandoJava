package Fechas;

import java.time.LocalTime;

public class LocalTimeExample01 {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //currentTime = currentTime.plusHours(3);
        //System.out.println(currentTime);

        //currentTime = currentTime.plusMinutes(58);
        //System.out.println(currentTime);

        //currentTime = currentTime.plusSeconds(5);
        //System.out.println(currentTime);

        currentTime = currentTime.plusNanos(300);
        System.out.println(currentTime);
    }
}
