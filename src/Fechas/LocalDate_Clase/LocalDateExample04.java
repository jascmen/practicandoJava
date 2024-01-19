package Fechas.LocalDate_Clase;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateExample04 {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //escribe aquí tu código
        DayOfWeek i = date.getDayOfWeek();

        System.out.println(i);

        return i.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es-ES"));
    }
}
