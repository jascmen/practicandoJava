package Fechas.ClaseCodeGym;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //currentTime = currentTime.plusHours(3);
        //System.out.println(currentTime);

        //currentTime = currentTime.plusMinutes(4);
        //System.out.println(currentTime);

        currentTime = currentTime.plusSeconds(4);
        System.out.println(currentTime);

        currentTime = currentTime.plusNanos(200);
        System.out.println(currentTime);
    }
}
