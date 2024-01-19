package Colecciones.Enums;

public class Month {

    public final int value ;
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);


    private Month(int value) {
        this.value = value;
    }

    public static Month[] values(){
        Month[] months = new Month[12];
        months[0] = JANUARY;
        months[1] = FEBRUARY;
        months[2] = MARCH;
        months[3] = APRIL;
        months[4] = MAY;
        months[5] = JUNE;
        months[6] = JULY;
        months[7] = AUGUST;
        months[8] = SEPTEMBER;
        months[9] = OCTOBER;
        months[10] = NOVEMBER;
        months[11] = DECEMBER;
        return months;
    }

    public int ordinal(){
        return value;
    }
}
