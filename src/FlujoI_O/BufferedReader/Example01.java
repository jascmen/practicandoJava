package FlujoI_O.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        //escribe aquí tu código
        try(Scanner scanner = new Scanner(System.in); FileReader file = new FileReader(scanner.nextLine()); BufferedReader in = new BufferedReader(file)) {
            int counter = 0;
            while (in.ready()){
                String line = in.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
