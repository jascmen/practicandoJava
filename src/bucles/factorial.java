package bucles;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= f; i++)
            result = result * i;
        System.out.println(result);

       /* int f = 1;
        for (int i = 1; i <= 10; i++)
            f = f * i;
        System.out.println(f);*/
    }

}
