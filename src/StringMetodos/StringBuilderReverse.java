package StringMetodos;

public class StringBuilderReverse {
    public static void main(String[] args) {
        String string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        //escribe aquí tu código
        java.lang.StringBuilder result = new java.lang.StringBuilder(string);
        result.reverse();
        return result.toString();
    }
}
