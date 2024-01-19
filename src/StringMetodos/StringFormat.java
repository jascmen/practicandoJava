package StringMetodos;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "My name is %s. I will earn $%d a month.";
        //escribe aquí tu código
        String  cadena = String.format(phrase, name, salary);
        return cadena;
    }
}
