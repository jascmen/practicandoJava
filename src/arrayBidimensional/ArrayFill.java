package arrayBidimensional;

import java.io.IOException;
import java.util.Arrays;

public class ArrayFill {
    //Rectángulo
    //Se te proporciona una matriz bidimensional de 5x6. Usando solo el método fill de la clase Arrays, llena la matriz con caracteres 'X' (mayúscula) y ' '(espacio) como se muestra en el siguiente ejemplo:
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {


        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[4], 'X');
        Arrays.fill(array[array.length-1], 'X');
        Arrays.fill(array[1], 1, array[1].length-1, ' ');
        Arrays.fill(array[2], 1, array[1].length-1, ' ');
        Arrays.fill(array[3], 1, array[1].length-1, ' ');



    }


}
