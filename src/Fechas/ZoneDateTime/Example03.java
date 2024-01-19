package Fechas.ZoneDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example03 {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        //escribe aquí tu código
        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }
}
