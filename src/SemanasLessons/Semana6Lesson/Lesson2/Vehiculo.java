package SemanasLessons.Semana6Lesson.Lesson2;

public class Vehiculo {

    static{
        System.out.println("Bloque de clase 1..." + Vehiculo.class.getName());
    }

    {
        System.out.println("Bloque de inicialización 1..." + Vehiculo.class.getName());
    }

    static{
        System.out.println("Bloque de clase 2..." + Vehiculo.class.getName() );
    }
    Vehiculo(){
        System.out.println("Constructor de la clase vehiculo" + Vehiculo.class.getName() );
    }

    static{
        System.out.println("Bloque de clase 3..." + Vehiculo.class.getName() );
    }

    {
        System.out.println("Bloque de inicialización 2..." + Vehiculo.class.getName() );
    }

    static{
        System.out.println("Bloque de clase 4..." + Vehiculo.class.getName() );
    }

}
