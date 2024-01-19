package SemanasLessons.Semana4Lesson.Lesson2;

public class StringMethodsExample01 {
    public static void main(String[] args) {
        String cadena = "asdasdasda asdasdasdas";
        System.out.println("longitud: "+cadena.length());
        //JSR = Java Specification Request

        System.out.println(cadena.isEmpty());

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i)+", ");
        }
        System.out.println();

        if(cadena.charAt(0)=='a'){
            System.out.println("La cadena empieza con a");
        }else{
            System.out.println("charAt(0) no es a, sino fue una: "+cadena.charAt(0));
        }
    }
}
