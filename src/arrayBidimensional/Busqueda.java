package arrayBidimensional;

import java.util.Scanner;

public class Busqueda {
    public static String[][] array = new String[][]{{"123", "Ikan", "Brad"},
            {"1425", "Pendleton", "Maria"},
            {"37", "Brad", "Andy"},
            {"98", "Bradford", "Maria"},
            {"6285", "Prost", "Sandra"},
            {"8", "Clover", "Ellen"},
            {"754", "Colton", "Isaac"}};

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();


        /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].equals(searchTerm)) {
                    // Si se encuentra la palabra buscada en el elemento, se imprime toda la fila
                    for (int k = 0; k < array[i].length; k++) {
                        System.out.print(array[i][k] + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }*/

        for (String[] row : array) {
            for (String element : row) {
                if (element.equals(searchTerm)) {
                    // Si el elemento contiene la palabra buscada, se imprime toda la fila
                    for (String item : row) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                    break; // Se detiene la búsqueda en esta fila
                }
            }
        }
    }
}
