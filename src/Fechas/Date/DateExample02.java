package Fechas.Date;

import java.util.Date;

public class DateExample02 {
    static Date birthDate = new Date(99,8,16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        //escribe aquí tu código
        int i = date.getDay();
        String salida = "";
        switch (i){
            case 0-> salida = "Sunday";
            case 1-> salida ="Monday";
            case 2-> salida ="Tuesday";
            case 3-> salida ="Wednesday";
            case 4-> salida ="Thursday";
            case 5-> salida ="Friday";
            case 6-> salida ="Saturday";

        }
        return salida;
    }
}
