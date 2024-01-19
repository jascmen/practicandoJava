package Fechas.ClaseCodeGym;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDateTime time2 = LocalDateTime.of(2024,Month.JANUARY, 25, 05, 04, 10);
        System.out.println(time2);

        System.out.println("2025: " + time2.getYear());

        System.out.println(time2.getMonth().name().toLowerCase());
        System.out.println(time2.getMonthValue());

        System.out.println(time2.getDayOfWeek());

        time2 = time2.plusDays(7);
        System.out.println(time2);

        time2 = time2.plusWeeks(-1);
        System.out.println(time2);

        time2 = time2.minusYears(4);
        System.out.println(time2);

    }
}
