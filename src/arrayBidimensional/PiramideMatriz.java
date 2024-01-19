package arrayBidimensional;

import java.io.IOException;
import java.util.Scanner;

public class PiramideMatriz {
    //La Pirámide
    //Escribamos un programa que dibuje una pirámide con una altura específica.
    //En la clase Solution, tienes una matriz bidimensional de caracteres (el campo array). Requerimientos:
    //
    //Leer un número del teclado. Este será la altura de la pirámide.
    //Inicializar la variable array con el valor apropiado.
    //Llenar la matriz de tal manera que forme una pirámide.
    // Usa '#' para llenar las celdas que componen la pirámide y ' ' para el fondo. Consulte el ejemplo a continuación.
    //Mostrar la matriz en la pantalla como se muestra en el ejemplo (cada fila en una línea separada).
    //Ejemplo de salida para el número 5:
    //    #
    //   ###
    //  #####
    // #######
    //#########
    public static char[][] array;

    public static void main(String[] args) throws IOException {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);

        int altura = scanner.nextInt();

        array = new char[altura][];
        for(int i =0; i< array.length; i++){
            array[i] = new char[((array.length-1)*2)+1];
            int mitad = (array[i].length -1)/2;
            for(int j =0; j< array[i].length; j++){
                if(j>=mitad-i && j<=mitad+i)
                    array[i][j] = '#';
                else
                    array[i][j] = ' ';
            }
        }

        for(int i =0; i< array.length; i++){
            for(int j =0; j< array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
