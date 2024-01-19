package SemanasLessons.semana3;

import java.util.Scanner;

public class Probando_break2 {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String palabra = scanner.nextLine();

            if (palabra.equals("basta"))
                break;
            System.out.println(palabra);
        }

    }
}
