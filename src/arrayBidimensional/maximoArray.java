package arrayBidimensional;

import java.util.Scanner;

public class maximoArray {
    //La clase Solución contiene un array bidimensional de 3x3 números (campo de matriz). En el método main, necesitas llenar la matriz, fila por fila, con datos leídos desde el teclado y mostrar el elemento máximo de la matriz.
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        int fila =0;
        int columna =0;
        for(int i=0; i< 9; i++){
            array[fila][columna] = scanner.nextInt();
            columna++;
            if(columna == 3){
                fila++;
                columna = 0;
            }

        }
        int maximo =array[0][0];
        for(int i=0; i< array.length; i++){
            for(int j=0; j< array[i].length; j++){
                if(array[i][j] > maximo){
                    maximo = array[i][j];
                }
            }
        }

        System.out.println(maximo);
    }
}
