package Fechas.LocalDate_Clase;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateExample02 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.now(zoneId);
        System.out.println(date);
        System.out.println("In Shangai , now: "+date2);


        LocalDate date3 = LocalDate.of(2023, Month.SEPTEMBER, 25);//los meses empiezan desde 1
        System.out.println(date3);

        LocalDate date4 = LocalDate.ofYearDay(2023, 365);//este metodo recibe el año y el dia del año
        System.out.println(date4);

        LocalDate date5 = LocalDate.ofEpochDay(1);//dias transcurridos desde 1970
        System.out.println(date5);

        date5 = date5.plusYears(5);
        System.out.println(date5);

        LocalDate localDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        System.out.println(localDate.getDayOfYear());


        LocalDate localDate2 = LocalDate.ofEpochDay(0);
        System.out.println(localDate2);

        long dias = ChronoUnit.DAYS.between(localDate2, localDate); //dias entre dos fechas
        System.out.println(dias);

        LocalDate localDate3 = LocalDate.ofEpochDay(18517);
        System.out.println(localDate3);


    }
}
