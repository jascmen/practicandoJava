package Fechas.Instan_Class;

import java.time.Instant;

public class InstantExample02 {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        //escribe aquí tu código

        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        //escribe aquí tu código
        Instant instant = Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
        return instant;
    }

    static Instant getMaxFromSecondsAndNanos() {
        //escribe aquí tu código
        Instant instant = Instant.ofEpochSecond(Instant.MAX.getEpochSecond(),Instant.MAX.getNano());
        return instant;
    }
}
