package bucles;

import java.util.Scanner;

public class contarLineas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 4; i++)
        {
            if (console.hasNextInt())
                count++;
            console.nextLine();
        }
        System.out.println(count);
        //si empieza asi : 12 buenas....   tambien lo contara
    }

}
