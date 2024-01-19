package SemanasLessons.Semana4Lesson.Lesson2;

public class EscapeChars01 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Hola\nMundo"); // \n :salto de linea
        System.out.println("Hola\tMundo"); // \t :tabulador
        System.out.println("Hola\bMundo"); // \b :backspace (borra el caracter anterior)
        System.out.println("Hola\rMundo");// \r :carriage return (borra todo lo que esta a la izquierda del cursor)
        System.out.println("Hola\fMundo");// \f :form feed
        System.out.println("Hola\"Mundo");// \" :comillas dobles (doble comilla)
        System.out.println("Hola\'Mundo");// \' :comillas simples (apóstrofe)
        System.out.println("Hola\\Mundo");// \\ :backslash (barra invertida)

        System.out.println("Hola\fMundo");// \f :form feed
    }
}
