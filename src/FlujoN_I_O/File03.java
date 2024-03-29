package FlujoN_I_O;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class File03 {
    private static final String THIS_IS_FILE = " - Este es un archivo";
    private static final String THIS_IS_DIR = " - Este es un directorio";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //escribe aquí tu código
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    System.out.println(path + THIS_IS_FILE);
                } else if (Files.isDirectory(path)) {
                    System.out.println(path + THIS_IS_DIR);
                }
            }
        }
    }
}
