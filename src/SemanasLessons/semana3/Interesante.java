package SemanasLessons.semana3;

import java.util.Scanner;

public class Interesante {
    public static void main(String[] args) {
        //escribe aquí tu código

        Scanner scanner = new Scanner(System.in);


        int suma =0;

        while(true){
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("ENTER")) {
                System.out.println(suma);
                break;
            }
            suma += Integer.parseInt(a);

        }
    }
}
