package Fechas.ClaseCodeGym;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTimeFormatterExample01 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        System.out.println(olimpiadasRio);

        int dias = olimpiadasRio.getDayOfYear() - hoje.getDayOfYear();
        System.out.println(dias + " dias para as Olímpiadas no Rio!");

        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = olimpiadasRio.format(formatador);
        System.out.println(valorFormatado);

        System.out.println(" --- Medida de tempo ---");

        //DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm:ss");
        DateTimeFormatter formatadorComHoras = new DateTimeFormatterBuilder()
                .appendPattern("dd/MMMM/yyyy")
                .toFormatter(new Locale("es", "MX"));

        //DateTimeFormatter fecha6 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy hh:mm");
        //System.out.println("EEEE, dd/MMMM/yyyy hh:mm:ss: " + fecha6.format(LocalDateTime.now()));

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        System.out.println(agora.format(formatadorComHoras));

        LocalDateTime fecha = LocalDateTime.now();
        System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es")));
        System.out.println(fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es")));

        //LocalTime intervalo = LocalTime.of(12, 30);
        //System.out.println(intervalo);

    }


}
