package SemanasLessons.Semana7Lesson.Lesson2;

import java.security.spec.RSAOtherPrimeInfo;

import static java.lang.Float.isInfinite;

public class AutoboxingExample {
    public static void main(String[] args) {
        Integer a = 10;
        System.out.println(a.intValue());
        System.out.println(a.floatValue());

        //Es igual a algo como esto:
        Integer b = new Integer(10);
        System.out.println("b: " + b);

        Integer c = new Integer("10");
        System.out.println(c+1);
        //internamente hizo esto:
        System.out.println(c.intValue() + 1);

        /*Integer d = null;
        try{
            d = new Integer("10#00");
            int valorConError = d.intValue();
            System.out.println(valorConError + 3);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("El numero proveido para d no fue correcto: " + d);
        }*/

        /*
         Descomentar para añadir manejo de excepciones
        String numero = "1123456a";
        int numberAsInteger = Integer.parseInt(numero);
        System.out.println("numberAsInteger: " + numberAsInteger);
        */

        //int resultado = 50 / 0;
        //System.out.println(resultado);

        boolean esInfinito = Double.isInfinite(3.3d/ 0.0);
        System.out.println("esInfinito: " + esInfinito );

        boolean isNotANumber = Double.isNaN(0.0 / 0.0d);
        System.out.println("isNotANumber: " + isNotANumber );

        boolean esInfinito2 = Float.isInfinite(3.3f/ 0.0f);
        System.out.println("esInfinito: " + esInfinito2 );

        boolean isNotANumber2 = Float.isNaN(0.0f / 0.0f);
        System.out.println("isNotANumber: " + isNotANumber2 );

    }

}
