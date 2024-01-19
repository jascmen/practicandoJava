import java.util.Scanner;

public class Probando {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        {
            if(age <18)
                if(age>=6)
                    System.out.println("hora de ir a la escuela");
                else
                    System.out.println("la universidad te espera");
        }
    }

}
