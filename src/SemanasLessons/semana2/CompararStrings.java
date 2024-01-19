package SemanasLessons.semana2;

public class CompararStrings {
    public static void main(String[] args) {
        String text = "Hi";
        String nuevo = "Hi";
        String message = text;
        String s1 = text.toUpperCase();
        String s2 = text.toUpperCase();
        System.out.println(nuevo==text); //es true porque apuntan a la misma referencia
        System.out.println(text == message); //es true porque apuntan a la misma referencia
        System.out.println(text == s1); // es false porque apuntan a referencias diferentes
        System.out.println(s1 == s2); // es true porque apuntan a la misma referencia
    }
}
