package SemanasLessons.semana2;

import java.util.Scanner;

public class ScannerExample01 {
    
    public static void main(String []args){  
        Scanner input = new Scanner(System.in);  
        System.out.print("Enter your name: ");  
        String nombre = input.nextLine();        
        
        System.out.println("Hello: " + nombre + ", How are you today?"); 
        String answer  = input.nextLine();  
        
        System.out.println("Your answer was: " + answer);

        input.close();     

    }  

}  