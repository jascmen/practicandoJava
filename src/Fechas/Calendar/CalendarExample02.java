package Fechas.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample02 {
    static Calendar birthDate = new GregorianCalendar(1999, Calendar.SEPTEMBER,16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //escribe aquí tu código
        String  salida = "";
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        switch (i){
            case 1-> salida = "Sunday";
            case 2-> salida ="Monday";
            case 3-> salida ="Tuesday";
            case 4-> salida ="Wednesday";
            case 5-> salida ="Thursday";
            case 6-> salida ="Friday";
            case 7-> salida ="Saturday";

        }
        return salida;
    }
}
