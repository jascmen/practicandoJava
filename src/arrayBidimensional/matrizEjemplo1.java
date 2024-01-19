package arrayBidimensional;

import java.util.Scanner;

public class matrizEjemplo1 {
    //Lea desde la consola un número R - el número de filas del array. El número debe ser mayor que 0.
    //Luego lee R números de la consola (cualquier número mayor que 0).
    //Luego inicializa el array bidimensional multiArray utilizando:
    //el número de filas R;
    //fila de arrays cuyo tamaño corresponde a los números introducidos en el paso 2 (en el orden en que se introducen).
    //Ejemplo:
    //
    //Se introduce el número 5.
    //Se introducen los números 1, 7, 5, 9 y 3.
    //Y obtenemos un array como este:
    //[]
    //[][][][][][][]
    //[][][][][]
    //[][][][][][][][][]
    //[][][]

    public static int[][] multiArray;

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        if(R<1)
            return;
        multiArray = new int [R][]; //R filas
        for (int i =0; i<R; i++){
            int numero = scanner.nextInt();
            multiArray[i] = new int [numero];
        }
        for(int j=0; j<multiArray.length; j++){
            for(int k=0; k<multiArray[j].length; k++){
                System.out.print("[]");
            }
            System.out.println();
        }

    }
}
