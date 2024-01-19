package FlujoN_I_O;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class File01 {
    private static final String THIS_IS_FILE = " - Este es un archivo";
    private static final String THIS_IS_DIR = " - Este es un directorio";

    public static void main(String[] args) {
        //escribe aquí tu código
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            }
            if (Files.isRegularFile(Path.of(str))) {
                System.out.println(str + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str))) {
                System.out.println(str + THIS_IS_DIR);
            } else {
                break;
            }
        }
    }
}
