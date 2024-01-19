package SemanasLessons.semana2;

import java.util.Scanner;

public class CompararDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA = scanner.nextDouble();
        double numberB = scanner.nextDouble();

        if (Math.abs(numberA - numberB) < 0.000001)
            System.out.println("Los números son iguales");
        else
            System.out.println("Los números no son iguales");
    }
}
