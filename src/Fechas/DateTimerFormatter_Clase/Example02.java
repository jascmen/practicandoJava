package Fechas.DateTimerFormatter_Clase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example02 {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        //escribe aquí tu código
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        String fecha = formatter.format(localDateTime);
        System.out.println(fecha);
    }
        }
