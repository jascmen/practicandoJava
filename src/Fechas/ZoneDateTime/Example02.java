package Fechas.ZoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Example02 {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //escribe aquí tu código
        TreeSet<String> zones = new TreeSet<>(ZoneId.getAvailableZoneIds());
        return zones;
    }

    static ZonedDateTime getBeijingDateTime() {
        //escribe aquí tu código
        ZonedDateTime beijing = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        return beijing;
    }
}
