package SemanasLessons.semana2;

public class WhileWhile02 {
    public static void main(String[] args) {
        int i = 1;
        int j =2;
        while (i++ <5){
            System.out.println(i);
            while (i==3){
                System.out.println("j: "+j);
                if (j++ ==7)
                    break;
            }
            System.out.println("i debe ser igual a 3: "+i+ "  y j debe ser igual a 7: "+j);
        }
        System.out.println("saliste del while papu");
    }
}
