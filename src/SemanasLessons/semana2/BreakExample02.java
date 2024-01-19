package SemanasLessons.semana2;

public class BreakExample02 {
    public static void main(String[] args) {
        boolean receso = false;
        for (int i =0; i<=100 && receso==false ; i++){
            if (i == 50) {
                receso = true;
            }
            System.out.println("i = " + i);
        }
    }
}
