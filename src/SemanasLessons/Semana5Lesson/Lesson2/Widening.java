package SemanasLessons.Semana5Lesson.Lesson2;

public class Widening {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 2;
        //int b3 = (b1 + b2) ;      --esto es widening
        byte b3 = (byte) (b1 + b2);
        //----
        byte b4  = 4;
        short s1 = 1;
        //int i1 = (int)(b4 + s1);  --muy redudante
        //int i1 = (b4 + s1);   --un poco menos redundante
        int i1 = b4 + s1;
        //------
        byte b5 = 5;
        short s6 = 6;
        byte b6 = (byte) (b5 +s6);
    }

}
