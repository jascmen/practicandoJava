package FlujoI_O.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOExample03 {
    public static void main(String[] args) {
        //escribe aquí tu código
        try(Scanner scanner = new Scanner(System.in); FileReader file = new FileReader(scanner.nextLine())) {

            while (file.ready()){
                char c = (char) file.read();
                if(c != '.' && c != ' ' && c != ','){
                    System.out.print(c);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
