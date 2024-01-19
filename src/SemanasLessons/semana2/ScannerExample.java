package SemanasLessons.semana2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        String str = "10 20 40 60.4";
        Scanner scanner = new Scanner(str); 

        int a = scanner.nextInt();
        System.out.println("a: " + a);
        int b = scanner.nextInt();
        System.out.println("b: " + b);
        
        int c = scanner.nextInt();
        System.out.println(c); 

        //--------------
        //Prueba de fuego!
        double d = scanner.nextDouble();
        System.out.println(d); 

        scanner.close();

    }
}