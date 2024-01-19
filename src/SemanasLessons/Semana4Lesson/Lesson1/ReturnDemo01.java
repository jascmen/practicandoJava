package SemanasLessons.Semana4Lesson.Lesson1;

public class ReturnDemo01 {
    public static void main(String[] args) {
        int resultado = m2(new Object());
        System.out.println("Resultado: " + resultado);
        //int resultado = m2(null);
        m2();

    }

    private static void m2() {
        for(int i=1; i<11; i++){
            if(i==3)
                //break;
                return ;
            System.out.println("i: " + i);
        }
        System.out.println("Hola me imprimio?");
    }

    private static int m2(Object obj) {
        int suma = -1;
        for(int i=1; i<11; i++){
            //suma += i;
            suma = suma + i;
        }
        return suma;
    }

}
