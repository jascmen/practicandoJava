package StringEjercicios;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String result = path.replace('/', '\\');

        System.out.println(result);
    }
}
