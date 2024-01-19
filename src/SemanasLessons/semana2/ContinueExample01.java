package SemanasLessons.semana2;

public class ContinueExample01 {
public static void main(String[] args) {
        int i = 0;
        while (i++ <=20){
            if(i%7==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
