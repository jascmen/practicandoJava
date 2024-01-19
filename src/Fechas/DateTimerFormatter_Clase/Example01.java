package Fechas.DateTimerFormatter_Clase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example01 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = formatter.format(LocalDateTime.now());
        System.out.println(fecha);
    }
}
