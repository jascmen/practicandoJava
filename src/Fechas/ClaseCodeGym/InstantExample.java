package Fechas.ClaseCodeGym;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2024-01-15T20:06:30.00Z");
        instant = instant.minus(Duration.ofDays(22));
        System.out.println(instant);

        instant = instant.plus(Duration.ofHours(3) );
        instant = instant.plus(Duration.ofMinutes(54) );
        instant = instant.plus(Duration.ofSeconds(30) );
        System.out.println(instant);

    }
}
