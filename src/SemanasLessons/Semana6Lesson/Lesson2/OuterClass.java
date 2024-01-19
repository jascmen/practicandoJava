package SemanasLessons.Semana6Lesson.Lesson2;

public class OuterClass {

    public static void main(String[] args) {
        //Crear un objeto interno (inner1)
        /*static*/ OuterClass outer1 = new OuterClass();
        /*static*/ InnerClass inner1 = outer1.new InnerClass();

        InnerClass inner2 = new OuterClass().new InnerClass();

        //Crear un objeto interno estatico (nestedObject)
        InnerStaticClass nestedObject = new InnerStaticClass();
        System.out.println(InnerStaticClass.x);
    }

    class InnerClass{
        int contador = 5;
    }

    static class InnerStaticClass{

        static int x = 22;
    }
}
