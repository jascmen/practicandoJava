package SemanasLessons.semana2;

public class Lesson02{
    public static void main(String[]args){
        Template t1 = new Template(10,20);
        System.out.println(t1.suma);
    }
}

class Template{
    int suma;
    Template(int x, int y){
        suma  = x+y;
    }
    int x;
    int y;
}