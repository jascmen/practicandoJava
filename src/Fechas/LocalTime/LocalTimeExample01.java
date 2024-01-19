package Fechas.LocalTime;

import java.time.LocalTime;

public class LocalTimeExample01 {
    public static void main(String[] args) {
        LocalTime date = LocalTime.now();
        System.out.println(date);
        System.out.println(date.getHour());
        System.out.println(date.getMinute());
        System.out.println(date.getSecond());
        System.out.println(date.getNano());

        date = date.plusMinutes(10);
        System.out.println(date);


        LocalTime date2 = LocalTime.of(23, 45, 10);
        System.out.println(date2);
    }
}
