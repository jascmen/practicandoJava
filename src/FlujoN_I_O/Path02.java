package FlujoN_I_O;

import java.nio.file.Path;
import java.util.Scanner;

public class Path02 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String str1 = scanner.nextLine();
         String str2 = scanner.nextLine();
         //escribe aquí tu código
         Path path1 = Path.of(str1);
         Path path2 = Path.of(str2);
         Path result = path1.relativize(path2);
         Path result2 = path2.relativize(path1);
         if (!result.toString().isEmpty()) {
             System.out.println(result);
         } else {
             System.out.println(result2);
         }
     }
}
