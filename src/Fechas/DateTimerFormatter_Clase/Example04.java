package Fechas.DateTimerFormatter_Clase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example04 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy").withLocale(Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", formatter);
        System.out.println(date);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("09:30:00", formatter2);
        System.out.println(time);

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);
    }
}
