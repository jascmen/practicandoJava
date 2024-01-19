package Fechas.Calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample03 {
    public static final String INVENTED = "Please pick up your pocket teleporter. Thanks for waiting!";
    public static final String NOT_INVENTED = "Sorry, teleportation hasn't been invented yet. Come back in 10 years.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //escribe aquí tu código
        boolean flag = true;
        while (flag){
            if(isTeleportInvented(currentDay)){

                flag = false;
            }
            else {

                currentDay.add(Calendar.YEAR, 10);
            }
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //escribe aquí tu código
        if(currentDay.after(INVENTION_DAY)) {
            System.out.println(INVENTED);
            return true;
        }else {
            System.out.println(NOT_INVENTED);
            return false;
        }
    }
}
