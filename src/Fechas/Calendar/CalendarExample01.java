package Fechas.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        Calendar calendar2 = new GregorianCalendar(2023,11,10);
        System.out.println(calendar2.getTime());

        System.out.println(calendar2.get(Calendar.YEAR));
        System.out.println(calendar2.get(Calendar.MONTH));
        System.out.println(calendar2.get(Calendar.DAY_OF_MONTH));

        calendar2.set(Calendar.YEAR, 2024);
        System.out.println(calendar2.getTime());

        calendar2.add(Calendar.MONTH, 1);
        System.out.println(calendar2.getTime());

        calendar2.roll(Calendar.MONTH, -4);//no cambia el año
        System.out.println(calendar2.getTime());



    }
}
