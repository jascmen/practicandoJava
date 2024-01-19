package SemanasLessons.semana3;

public class ArraysExample02 {
    public static void main(String[] args) {
        int diez    = 10;
        int veinte  = 20;
        int treinta = 30;
        boolean comparacion = diez < veinte;
        int[] array;
        if (comparacion)
            array = new int[treinta];
        else
            array = new int[veinte];

        for (int i = 0; i < array.length; i++){

            if(i==9 || i==19 || i==29)
                System.out.println(array[i]);
            else
                System.out.print(array[i]+",");
        }
        //System.out.println(array.length);
    }

}
