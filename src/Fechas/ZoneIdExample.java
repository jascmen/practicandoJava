package Fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Lima");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getHour());
        System.out.println(zonedDateTime.getHour());
        System.out.println(zonedDateTime.getMinute());
        System.out.println(zonedDateTime.getSecond());
        System.out.println(zonedDateTime.getDayOfYear());
        System.out.println(zonedDateTime.getDayOfMonth());
        System.out.println(zonedDateTime.getDayOfWeek());
    }
}
