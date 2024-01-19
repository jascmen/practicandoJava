package Fechas.ClaseCodeGym;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample01 {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Africa/Cairo");
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println(time);
        System.out.println(time.getZone());
        System.out.println(time.getHour());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfWeek());

    }

}
