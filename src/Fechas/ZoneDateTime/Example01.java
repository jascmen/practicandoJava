package Fechas.ZoneDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example01 {
    public static void main(String[] args) {
        for (String s: ZoneId.getAvailableZoneIds())
            System.out.println(s);

        ZoneId zone = ZoneId.of("Africa/Cairo");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zone);
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.now();
        System.out.println(zonedDateTime2);

        LocalDateTime date =  zonedDateTime.toLocalDateTime();
        System.out.println(date);
    }
}
