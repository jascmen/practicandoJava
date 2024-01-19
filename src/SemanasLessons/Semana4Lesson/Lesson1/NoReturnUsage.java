package SemanasLessons.Semana4Lesson.Lesson1;

public class NoReturnUsage {
    public static void main(String[] args) {
        //metodo();
        metodoSaid();
    }


    static void metodo(){
        for(int i=0; i<20; i++){
            if(i<11)
                System.out.println(i);
            else
                return ;
        }
    }

    static void metodoSaid(){
        boolean once = false;
        for(int i=0; i<20 && !once; i++){
            System.out.println(i);
            if(i==11)
                once = true;
        }
    }

}
