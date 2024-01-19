package arrayEjercicios;

import java.util.Scanner;

public class arrayMaximo {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] array = new int[n];
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for(int j = 0; j < array.length; j++){
            if(array[j] > max){
                max = array[j];
            }
        }
        System.out.println(max);
    }
}
