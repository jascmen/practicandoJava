package SemanasLessons.Semana4Lesson.Lesson2;

public class EqualsExample01 {
    public static void main(String[] args) {
        String nombre = "Juan Perez";
        String nombre2 = "juan Perez";
        System.out.println(nombre.equals(nombre2));
        System.out.println(nombre.equalsIgnoreCase(nombre2));
        System.out.println(nombre.toUpperCase().equals(nombre2.toUpperCase()));
        System.out.println(nombre==nombre2);


        boolean resultado = nombre.startsWith("J");
        System.out.println("resultado: "+!resultado);
    }
}
