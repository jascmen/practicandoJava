package SemanasLessons.semana2;

public class OperadorTernario{
    public static void main(String[] args) {
        String nombre   = "Maria Luisa";    // #123AB
        String persona2 = nombre;           // nombre -> #123AB

        if(nombre == persona2)
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");

        
        System.out.println((nombre==persona2)?"Iguales":"Diferentes");

    }

}