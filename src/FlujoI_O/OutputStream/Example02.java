package FlujoI_O.OutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter output = new FileWriter (scanner.nextLine())) {
            char[] chars = new char[]{'j', 'a', 'v', 'a'};
            for (char aChar : chars) {
                output.write(aChar);
            }
        } catch (IOException e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}
