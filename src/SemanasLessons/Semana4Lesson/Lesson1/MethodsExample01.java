package SemanasLessons.Semana4Lesson.Lesson1;

public class MethodsExample01 {
    public static void main(String[] args) {
        m1();
        m1(3);
        m1(1,2);
    }

    static void m1(){
        System.out.println("M1");
    }
    static void m1(int veces){
        for(int i=0; i< veces; i++){
            System.out.println("M1 version 1");
        }
    }

    static void m1(int veces, int algunOtroContador){
        System.out.println("M1 version 2");
    }

}
