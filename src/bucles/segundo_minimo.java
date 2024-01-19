package bucles;

import java.util.Scanner;

public class segundo_minimo {
    public static void main(String[] args) {
        //hallar el 2do minimo
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while (scanner.hasNextInt())
        {
            int x = scanner.nextInt();
            if(x<min) {
                min2 = min;
                min = x;
            }else if(x>min && x<min2){
                min2 = x;
            }

        }
        System.out.println(min2);


    }
}
