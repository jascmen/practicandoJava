package Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterExample {
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
            //DateTimeFormatter formatadorComHoras = new DateTimeFormatterBuilder()
            //       .toFormatter(new Locale("es", "ES"));

            DateTimeFormatter fecha6 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy hh:mm", new Locale("es", "ES"));
            DateTimeFormatter fecha7 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy hh:mm", Locale.ENGLISH);
            System.out.println("EEEE, dd/MMMM/yyyy hh:mm:ss: " + fecha6.format(LocalDateTime.now()));
            System.out.println("EEEE, dd/MMMM/yyyy hh:mm:ss: " + fecha7.format(LocalDateTime.now()));

            LocalDateTime agora = LocalDateTime.now();
            System.out.println(agora);
            System.out.println(agora.format(fecha6));

            //LocalTime intervalo = LocalTime.of(12, 30);
            //System.out.println(intervalo);

        }

    }

