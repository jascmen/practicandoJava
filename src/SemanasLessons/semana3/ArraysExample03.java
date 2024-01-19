package SemanasLessons.semana3;

public class ArraysExample03 {
    public static void main(String[] args) {
        int participantes = 3;

        //String nombre  = new String("Marx");
        //String nombre1 = "Marx";

        String[] nombres = new String[participantes];
        nombres[0] = "William";
        nombres[1] = "Marx";
        //nombres[2] = null;

        for(String s : nombres){
            if (s != null)
                System.out.println(s.toUpperCase());
        }
        //System.out.println(s.toU);

        for (String i : nombres) {
            if (i != null)
                //System.out.println(i.toString());
                System.out.println(i);
        }

    }

}
