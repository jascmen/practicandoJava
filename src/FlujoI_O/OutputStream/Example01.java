package FlujoI_O.OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream writer = new FileOutputStream(scanner.nextLine())) {
            byte[] bytes = new byte[]{106, 97, 118, 97};
            writer.write(bytes);
        } catch (IOException e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}
