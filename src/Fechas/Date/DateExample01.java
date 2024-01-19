package Fechas.Date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateExample01 {
    public static void main(String[] args) {
        Date current = new Date();
        //para comparar se usa after y before
        SimpleDateFormat formateado = new SimpleDateFormat("MMMM-dd-YYYY");
        SimpleDateFormat formateado2 = new SimpleDateFormat("MMM-dd-YYYY");
        String salida = formateado.format(current);
        System.out.println(salida);
        System.out.println(formateado2.format(current));

        Date fecha = new Date();
        fecha.setTime(Date.parse("Jul 06 12:15:00 2019"));
        //Date fecha = new Date("Jul 06 12:15:00 2019"); es lo mismo
        System.out.println(fecha);

        System.out.println("-------------------");
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);

        // Crear un formateador de fecha con el Locale en español
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("es", "ES"));

        // Formatear la fecha
        String fechaFormateada = fechaActual.format(formatter);

        //System.out.println("Fecha formateada en español: " + fechaFormateada);
        System.out.println("Fecha formateada en español: " + fechaActual.format(formatter));

        // Obtener la fecha actual
        LocalDate fechaActual2 = LocalDate.now();

        // Crear un formateador de fecha con el Locale en inglés
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);

        // Formatear la fecha
        String fechaFormateada2 = fechaActual.format(formatter2);

        System.out.println("Fecha formateada en inglés: " + fechaFormateada2);



    }
}
