package arrayBidimensional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

public class COdigoQrNiIdea {
    //QR-code lector
    //Vamos a escribir un programa para leer códigos QR falsos. El programa recibe una matriz bidimensional expectedArray que es 3x3.
    //Esta matriz almacena un código QR falso. Ya hay código que llena aleatoriamente esta matriz. Si quieres, puedes llenarla tú mismo, eso no afectará las pruebas.
    //Debes escribir código para llenar la matriz actualArray con valores leídos desde el teclado. Leeremos un carácter a la vez. Los espacios representan celdas vacías y '#' representan celdas llenas.
    //Luego, usando el método apropiado de la clase Arrays, debes comparar esta matriz con la matriz expectedArray y mostrar el resultado de la comparación: true si las matrices son iguales o false si son diferentes
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[0].length; j++) {
                actualArray[i][j] = reader.readLine();
            }
        }


        System.out.println(Arrays.deepEquals(expectedArray, actualArray));
    }
}
