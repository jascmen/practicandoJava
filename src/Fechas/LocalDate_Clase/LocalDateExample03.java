package Fechas.LocalDate_Clase;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample03 {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //escribe aquí tu código
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    static LocalDate ofExample() {
        //escribe aquí tu código
        LocalDate localDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return localDate;
    }

    static LocalDate ofYearDayExample() {
        //escribe aquí tu código
        LocalDate localDate = LocalDate.ofYearDay(2020, 256);
        return localDate;
    }

    static LocalDate ofEpochDayExample() {
        //escribe aquí tu código
        LocalDate localDate = LocalDate.ofEpochDay(18517);
        return localDate;
    }
}
