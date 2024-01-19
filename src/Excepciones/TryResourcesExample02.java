package Excepciones;

import java.util.Scanner;

public class TryResourcesExample02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());

        } catch (Exception e) {
            System.out.println("Algo salió mal : " + e);
        }
        finally {
            scanner.close();
        }
    }
}
