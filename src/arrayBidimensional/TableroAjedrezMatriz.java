package arrayBidimensional;

import java.util.Scanner;

public class TableroAjedrezMatriz {
    //Tablero de ajedrez
    //Vamos a crear un programa para generar tableros de ajedrez cuadrados con una dimensión dada.
    //En la clase Solution, tienes una matriz bidimensional de caracteres (el campo de matriz). Requerimientos:
    //
    //Leer un número desde el teclado. Este será la dimensión de nuestro tablero (la longitud de un lado);
    //Inicializar la variable de la matriz con el valor apropiado;
    //"Pintar" la matriz para obtener un patrón de tablero de ajedrez (celdas negras - '#', blancas - ' ').
    // Comience el patrón colocando un '#' en la esquina superior izquierda de la matriz;
    //Mostrar la matriz en la pantalla como se muestra en el ejemplo (cada fila en una línea separada).
    //Ejemplo de salida para el número 5:
    //# # #
    // # #
    //# # #
    // # #
    //# # #

    public static char[][] array;

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        array = new char[numero][numero];

        for(int i =0; i< array.length; i++){
            for (int j =0; j<array[i].length; j++){
                if((i+j)%2==0)
                    array[i][j] = '#';
                else
                    array[i][j] = ' ';
            }
        }

        for(int k =0; k< array.length; k++){
            for (int l =0; l<array[k].length; l++){
                System.out.print(array[k][l]);
            }
            System.out.println();
        }
    }


}
