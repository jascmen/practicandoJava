package Fechas;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.getMonth().name());
        System.out.println(date.getHour());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getDayOfWeek());

        System.out.println(date.getHour()+":"+date.getMinute()+":"+date.getSecond());
    }
}
