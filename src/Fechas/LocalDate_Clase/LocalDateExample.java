package Fechas.LocalDate_Clase;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date2 = LocalDate.of(2020, Month.APRIL, 25);
        System.out.println(date2);

        System.out.println("Año: "+date2.getYear());
        System.out.println(date2.getMonth().name().toLowerCase());

        System.out.println(date2.getMonthValue());

        System.out.println(date2.getDayOfWeek());

        date2= date2.plusDays(7);
        System.out.println(date2);

        date2 = date2.minusDays(7);
        System.out.println(date2);

        date2 = date2.plusWeeks(-1);
        System.out.println(date2);

        date2 = date2.minusYears(2);
        System.out.println(date2);

    }
}
