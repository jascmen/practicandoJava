package FlujoN_I_O;

import java.nio.file.Path;
import java.util.Scanner;

public class Path01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //escribe aquí tu código
        Path path = Path.of(str);
        System.out.println(path.getRoot());
    }
}
