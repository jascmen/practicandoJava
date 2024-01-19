package SemanasLessons.Semana4Lesson.Lesson2;

public class SubStringExample {
    public static void main(String[] args) {
        String texto = "Hoy es jueves 9 de noviembre del 2023 y es un bonito dia";
        //String cadena = texto.substring(texto.indexOf(" y es ")+3);
        //System.out.println(cadena);

        //String cadena = texto.substring(14);
        //System.out.println(texto.charAt(14));
        //System.out.println(cadena);

        String cadena = texto.substring(14, 20); //el primer valor es inclusivo, el segundo es excluyente
        System.out.println(cadena);
    }
}
