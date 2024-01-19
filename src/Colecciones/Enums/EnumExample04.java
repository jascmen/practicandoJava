package Colecciones.Enums;

public enum EnumExample04 {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //escribe aquí tu código

    public static EnumExample04[] getWinterMonths(){
        return new EnumExample04[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static EnumExample04[] getSpringMonths(){
        return new EnumExample04[]{MARCH, APRIL, MAY};
    }

    public static EnumExample04[] getSummerMonths(){
        return new EnumExample04[]{JUNE, JULY, AUGUST};
    }

    public static EnumExample04[] getAutumnMonths(){
        return new EnumExample04[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }
}
