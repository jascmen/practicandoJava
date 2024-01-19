package SemanasLessons.Semana6Lesson.Lesson1;

public class ObjectComparison /*extends Object*/ {
    public static void main(String[] args) {
        //Estudiante e1 = new Estudiante();
        //Estudiante e2 = new Estudiante();
        Estudiante e1 = new Estudiante("Pepe");
        Estudiante e2 = new Estudiante("Pxpx");
        //Estudiante e2 = e1;
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e1 == e2);//false  porque son dos objetos diferentes
        System.out.println(e1.equals(e2)); //false porque no tienen el mismo nombre
        System.out.println(e1.hashCode() == e2.hashCode()); //false porque no tienen el mismo nombre
    }

}
