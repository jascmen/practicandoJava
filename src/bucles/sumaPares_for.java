package bucles;

import java.util.Scanner;

public class sumaPares_for {
    //El método main lee 3 enteros desde el teclado: start, end y multiple.
    //Actualice el programa para que la pantalla muestre la suma de los múltiplos de la variable multiple en el rango de start (incluido) a end (no incluido).
    //Use un for ciclo para hacer esto.
    //Sugerencia: Para pasar a la siguiente iteración del ciclo, utilice un continue la declaración.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //escribe aquí tu código
        for(int i = start; i < end; i++){
            if(i % multiple != 0){
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }
}
