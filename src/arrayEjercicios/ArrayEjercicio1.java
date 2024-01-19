package arrayEjercicios;

public class ArrayEjercicio1 {
    //El orden correcto
    //Vamos a escribir una utilidad para trabajar con matrices. La funcionalidad principal está lista:
    // el método printArray() muestra todos los elementos de la matriz en la consola.
    //Lo que te queda es una bagatela: implementa el método reverseArray(). Debería invertir el orden de los elementos en la matriz.
    //El método solo debería funcionar con matrices de valores enteros (int[]).
    //
    //Ejemplo:
    //Si la matriz contiene los elementos:
    //1, 2, 3, 4, 5, 6, 7, 8, 9, 0
    //luego, después de llamar al método reverseArray(), debería contener:
    //0, 9, 8, 7, 6, 5, 4, 3, 2, 1

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //escribe aquí tu código
        for(int i =0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;

        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
