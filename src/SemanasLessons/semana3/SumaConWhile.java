package SemanasLessons.semana3;

public class SumaConWhile {
    public static void main(String[] args) {
        // suma de los números  del 1 al 100 que no son múltiplos de tres

        int i = 0;
        int suma =0;
        while  (i<=100){

            if (i%3==0) {
                i++;
                continue;
            }
            suma += i;
            i++;
        }
        System.out.println(suma);
    }
}
