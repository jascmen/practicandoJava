package SemanasLessons.semana3;

import java.util.Scanner;

public class Suma_Enter {
    //Escribamos un programa que lea números enteros desde el teclado y calcule su suma hasta que el usuario ingrese la palabra "ENTER".
    //Muestra la suma y finaliza el programa.

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
