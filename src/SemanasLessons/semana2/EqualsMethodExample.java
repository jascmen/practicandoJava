package SemanasLessons.semana2;

public class EqualsMethodExample{
    public static void main(String[] args) {
        String nombre1 = "Aimar";
        String nombre2 = "Aimar";

        String nombre1ConMayusculas = nombre1.toUpperCase();
        System.out.println(nombre1ConMayusculas);
        String nombre2ConMayusculas = nombre2.toUpperCase();
        System.out.println(nombre2ConMayusculas);

        if(nombre1ConMayusculas .equals( nombre2ConMayusculas ))
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");
    }

}