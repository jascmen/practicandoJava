package arrayEjercicios;

import java.util.Scanner;

public class mostrarInversos {
    //Lea un número entero N de la consola.
    //Si el número N es mayor que 0, entonces el programa lee N números adicionales.
    //Imprime los números en la consola. Si N es impar, muéstralos en el orden en que se introdujeron. De lo contrario, muéstralos en orden inverso.
    //Muestra cada número en una nueva línea. No muestre el número N.

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero>0){
            int [] array = new int[numero];
            for (int i=0; i<array.length; i++){
                array[i] = scanner.nextInt();
            }

            if (numero % 2 != 0) {
                for(int j =0; j<array.length;j++){
                    System.out.println(array[j]);
                }
            }else{
                for(int j =array.length-1; j>=0;j--){
                    System.out.println(array[j]);
                }
            }
        }
    }
}
