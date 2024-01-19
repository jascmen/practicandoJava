package SemanasLessons.Semana6Lesson.Lesson1;

public class Escuela {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Juan");
        Estudiante e3 = new Estudiante("Hector", "Mendez");
        System.out.println(e1.getNombre());
        System.out.println(e2.getNombre());
        System.out.println(e3.getNombre());
    }

}
