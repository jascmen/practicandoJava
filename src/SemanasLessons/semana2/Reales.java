package SemanasLessons.semana2;

import java.util.Scanner;

public class Reales {
    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();

        if (Math.abs(numero1 - numero2) < 0.000001) // para saber si dos números son iguales, se usa la función Math.abs() para obtener el valor absoluto de la resta de los dos números y se compara con un valor muy pequeño (0.000001)
            System.out.println("Los números son iguales");
        else
            System.out.println("Los números no son iguales");
    }
}