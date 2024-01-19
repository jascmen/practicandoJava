package bucles;

import java.util.Scanner;

public class minimo_while {
    public static void main(String[] args) {
        //hallar el minimo
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scanner.hasNextInt())
        {

            int x = scanner.nextInt();
            if (x <= min)
                min = x;
        }
        System.out.println(min);

    }
}
