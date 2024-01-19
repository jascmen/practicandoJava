package SemanasLessons.Semana4Lesson.Lesson1;

public class LocalVariablesExample {
    public static void main(String[] args) {
        int participantes = 26;
        if(participantes > 20){
            int esDivertidaLaClase = -1;
            System.out.println("La clase de java esta genial");
            if(participantes>10){
                /*int*/ esDivertidaLaClase = 0;
                System.out.println("La clase esta divertida");
                esDivertidaLaClase = 10;
            }
            System.out.println("Al final la clase fue divertida  --> score:  " + esDivertidaLaClase);
        }
        System.out.println("adios");
    }

}
