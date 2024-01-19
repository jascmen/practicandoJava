package SemanasLessons.semana2;

public class StringMemoryExample{
    public static void main(String[] args) {
        String s1 = "-";
        String s2 = "--";
        s2 = "un valor";
        
        //la referencia s1 apunta a la referencia s2("un valor")
        s1 = s2;
        System.out.println(s1);
    }
}