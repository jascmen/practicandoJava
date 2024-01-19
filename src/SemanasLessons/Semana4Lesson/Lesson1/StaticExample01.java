package SemanasLessons.Semana4Lesson.Lesson1;

public class StaticExample01 {
    public static void main(String[] args) {
        StaticExample01.metodo1();
        //StaticExample01.metodo2();   --  esto no es compilable

        StaticExample01 variable = new StaticExample01();
        variable.metodo2();

        variable.metodo1();
        metodo1();
        StaticExample01.metodo1();
    }


    static void metodo1(){  //Metodo de clase
        System.out.println("Metodo 1 estatico");
    }

    void metodo2(){         //Metodo de instancia
        System.out.println("Metodo 2 NO estatico");
    }

}
