package SemanasLessons.Semana5Lesson.Lesson2;

public class NarrowingExample {
    int a;
    static double uno;
    static float dos;

    public static void main(String[] args) {
        /*
        long a = 1L;        //define
        int b = (int) a;    //narrowing (degradó/redujó)
        short c = (short) b;//narrowing (degradó/redujó)
        byte d = (byte) c;  //narrowing (degradó/redujó)
        System.out.println(a);
        */

        /*
        long a = 1L;
        long b = 2L;
        long c = a + b;
        System.out.println(c);
         */

        //double pi = 3.141529d;
        //double uno = pi + 1;

        System.out.println(uno);
        System.out.println(dos);

        float f1 = 0;
        System.out.println(f1);

        int bigNumber = 10_000_000;
        System.out.println(bigNumber);
    }

}
