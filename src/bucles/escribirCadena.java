package bucles;

import java.util.Scanner;

public class escribirCadena {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);

        String cadena = scanner.nextLine();
        int numero = scanner.nextInt();
        int contador = 0;
        if (numero <= 0 || numero >= 5) {
            System.out.println(cadena);
        } else {
            do {
                System.out.println(cadena);
                contador++;
            } while (contador < numero);

        }
    }
}
