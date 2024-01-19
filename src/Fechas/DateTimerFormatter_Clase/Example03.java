package Fechas.DateTimerFormatter_Clase;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Example03 {
    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        //escribe aquí tu código
        //String zona = zonedDateTime.getZone().toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String salida = formatter.format(zonedDateTime);
        System.out.println(salida);
    }
}
