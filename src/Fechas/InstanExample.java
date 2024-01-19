package Fechas;

import java.time.Duration;
import java.time.Instant;

public class InstanExample {
    public static void main(String[] args) {
        /*Instant current = Instant.now();
        System.out.println(current);
        System.out.println(current.getEpochSecond());
        System.out.println(current.getNano());*/

        Instant current2 = Instant.parse("2024-01-15T00:00:00.00Z");
        System.out.println(current2);

        current2 = current2.minus(Duration.ofDays(1));// esto es un dia menos
        System.out.println(current2);

        current2 = current2.minus(Duration.ofHours(1));// esto es una hora menos
        System.out.println(current2);

        current2 = current2.minus(Duration.ofMinutes(1));// esto es un minuto menos
        System.out.println(current2);

        current2 = current2.minus(Duration.ofSeconds(1));// esto es un segundo menos
        System.out.println(current2);



    }
}
