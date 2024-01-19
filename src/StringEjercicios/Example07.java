package StringEjercicios;

public class Example07 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //escribe aquí tu código
        int indice = path.indexOf("jdk");
        int indice2 = path.indexOf("/", indice);

        String first = path.substring(0, indice);
        String last = path.substring(indice2);
        return first + jdk + last;
    }
}
