package FlujoN_I_O;

import java.nio.file.Path;
import java.util.Scanner;

public class Path03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //escribe aquí tu código
        Path path = Path.of(str);
        if(path.isAbsolute())
            System.out.println(path);
        else
            System.out.println(path.toAbsolutePath());
    }
}
