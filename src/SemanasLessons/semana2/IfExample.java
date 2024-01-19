package SemanasLessons.semana2;

public class IfExample {
    public static void main(String[] args) {
        //int participantes = 35;
        //int participantes = 15;
        int participantes = 7;
        if(participantes > 20){
            System.out.println("Son más de 20 participantes");
        }else{
            if(participantes==0){
                System.out.println("Cero participantes");
            }else{
                System.out.println("Son menos de 20 participantes");
            }
            
        }
        
    }

}
