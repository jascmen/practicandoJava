package StringEjercicios;

public class Example05 {
    public static void main(String[] args) {
        String cadena = "https://domain.com/about/reviews";
        int indice = cadena.indexOf("//");
        //System.out.println(indice);
        int indice2 = cadena.indexOf("/", indice+2 );
        //System.out.println(indice2);

        String first = cadena.substring(0, indice+2);//https://
        System.out.println(first);
        String last = cadena.substring(indice2);
        System.out.println(last);

        String result = first + "codegym.cc" + last;
        System.out.println(result);
    }
}
