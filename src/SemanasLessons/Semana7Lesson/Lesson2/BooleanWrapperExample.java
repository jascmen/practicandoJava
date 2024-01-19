package SemanasLessons.Semana7Lesson.Lesson2;

public class BooleanWrapperExample {
    public static void main(String[] args) {
        boolean todoBien = true;
        Boolean claseCorrecta = new Boolean("true");
        System.out.println(claseCorrecta);

        claseCorrecta = new Boolean("false");
        System.out.println(claseCorrecta);

        claseCorrecta = new Boolean(Boolean.TRUE);
        System.out.println(claseCorrecta);

        claseCorrecta = new Boolean(Boolean.FALSE);
        System.out.println(claseCorrecta);


        claseCorrecta = new Boolean(true);
        System.out.println(claseCorrecta);

        claseCorrecta = new Boolean(false);
        System.out.println(claseCorrecta);
    }

}
