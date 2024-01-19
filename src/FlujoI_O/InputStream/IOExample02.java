package FlujoI_O.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class IOExample02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (fis.available() > 0) {
                int read = fis.read(buffer);
                fos.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Algo salió mal : " + e);
        }
    }
}
