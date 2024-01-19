package bucles;

import java.util.Scanner;

public class maximo_while {
    static public void  main (String[] args){
        Scanner console = new Scanner(System.in);
        int max = 0;
        //int max = Integer.MIN_VALUE; // -2147483648
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}
