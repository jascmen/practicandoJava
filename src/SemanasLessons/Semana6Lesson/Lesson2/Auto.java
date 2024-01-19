package SemanasLessons.Semana6Lesson.Lesson2;

public class Auto extends Vehiculo{

    Auto(){
        System.out.println("Constructor de la clase" + this.getClass().getName());
    }

    static{
        Class c = Auto.class;
        System.out.println("bloque estatico de la clase " + c.getName() );
    }

    {
        System.out.println("Bloque de instancia la clase: " + this.getClass().getName() );
    }

}
