package SemanasLessons.Semana7Lesson.Lesson2;

public class CharacterExample {
    public static void main(String[] args) {
        int numero = 64;
        boolean esLetra = Character.isLetter(numero);
        System.out.println("esLetra: " + esLetra );

        numero = 96; //a
        boolean isMinuscula = Character.isLowerCase(numero);
        System.out.println("esMinuscula:" + isMinuscula);
    }

}
