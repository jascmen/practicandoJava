package arrayBidimensional;

import java.util.Scanner;

public class MatrizSumaPeque {
    //La suma mas pequeña
    //La clase Solution contiene una matriz bidimensional de números de 3x3 (array field).
    // En el método main, es necesario llenar esta matriz, fila por fila, con datos leídos del teclado,
    // calcular la suma de los elementos en cada columna y en cada fila, y luego mostrar en la pantalla
    // la suma más pequeña de estas sumas.

    public static int[][] array = new int[3][3];
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<9;i++){
            array[i/3][i%3] = scanner.nextInt();
        }
        int sumaMin=array[0][0]+array[0][1]+array[0][2];
        int sumaFila;
        int sumaColumna;
        for(int j =0; j< array.length;j++){
            sumaFila =0;
            sumaColumna =0;
            for(int k =0; k< array[j].length;k++){
                sumaFila += array[j][k];
            }
            if(sumaFila<sumaMin){
                sumaMin = sumaFila;
            }

            for(int l =0; l< array.length;l++){
                sumaColumna += array[l][j];
            }
            if(sumaColumna<sumaMin){
                sumaMin = sumaColumna;
            }
        }
        System.out.println(sumaMin);

    }
}
