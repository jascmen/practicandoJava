package arrayEjercicios;

import java.util.Scanner;

public class arrayMinimo {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if(n>0) {
            int[] array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            int min = array[0];

            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
            System.out.println(min);
        }
        //code gym solucion

        /*public static int[] array;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = Integer.parseInt(scanner.nextLine());
            }

            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                int number = array[i];
                if (number < min) {
                    min = number;
                }
            }
            System.out.println(min);
        }*/

    }
}
