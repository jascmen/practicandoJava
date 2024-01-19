package Fechas.LocalDateTime_Clase;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample01 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);

        LocalDateTime date2 = LocalDateTime.of(2025, Month.SEPTEMBER,16,23,11);
        System.out.println(date2);

        LocalDate localDate  = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime date3 = LocalDateTime.of(localDate,time);
        System.out.println(date3);
    }

}
