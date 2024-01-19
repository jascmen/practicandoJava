package Fechas.ZoneDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example04 {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");
        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        //escribe aquí tu código
        ZonedDateTime fromZonedDateTime = ZonedDateTime.of(fromDateTime, fromZone);
        ZonedDateTime result = fromZonedDateTime.withZoneSameInstant(toZone);

        return result.toLocalDateTime();
    }
}
