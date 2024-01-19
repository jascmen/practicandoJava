package FlujoN_I_O;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class File05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //escribe aquí tu código
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourceDirectory)) {
            for (Path path : directoryStream) {
                if (Files.isRegularFile(path)) {
                    Files.move(path, targetDirectory.resolve(path.getFileName()));
                }
            }
        }
    }
}
