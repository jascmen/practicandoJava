package arrayBidimensional;

import java.util.Scanner;

public class transponerMatriz {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //¡Qué reflejo!
        //La clase Solution contiene una matriz bidimensional 3x3 de números (array), se requiere:
        //
        //Llenar esta matriz, fila por fila, con números leídos del teclado.
        //Reflejar (transponer) la matriz sobre la diagonal principal (la diagonal principal es el conjunto de celdas para las cuales i == j).
        //Mostrar la matriz reflejada en la pantalla como se muestra en el ejemplo
        // (cada fila en una línea separada y cada elemento de una fila separado por un espacio).


        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int m = 0; m < array.length; m++) {
            for (int n = 0; n < array[m].length; n++) {
                System.out.print(array[m][n] + " ");
            }
            System.out.println();
        }


    }
}
