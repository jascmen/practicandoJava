package Fechas;

import java.util.Calendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {
        int year = 2024;
        int dayOfMonth = 15;
        //Calendar date = new GregorianCalendar(year, Calendar.JANUARY, dayOfMonth);
        int hour =20;
        int minute = 30;
        int second = 15;
        //Calendar date = new GregorianCalendar(year, Calendar.JANUARY, dayOfMonth, hour, minute, second);
        Calendar date = Calendar.getInstance(); //fecha actual del sistema
        System.out.println(date.getTime());

        System.out.println(date.get(Calendar.ERA));//0 antes de cristo, 1 despues de cristo
        System.out.println(date.get(Calendar.YEAR));

        System.out.println(date.get(Calendar.MONTH));//0 enero, 11 diciembre
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        System.out.println(date.get(Calendar.DAY_OF_WEEK));//1 domingo, 7 sabado

        System.out.println("----------------------");

        date.set(Calendar.DAY_OF_MONTH, 2);
        System.out.println(date.get(Calendar.DAY_OF_WEEK));
        System.out.println(date.getTime());
    }
}
