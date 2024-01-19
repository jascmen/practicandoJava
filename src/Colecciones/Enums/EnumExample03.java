package Colecciones.Enums;

public class EnumExample03 {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //escribe aquí tu código
        int index = month.ordinal();
        if(index== 11){
            index = -1;
        }
        return Month.values()[index + 1];
    }
}
