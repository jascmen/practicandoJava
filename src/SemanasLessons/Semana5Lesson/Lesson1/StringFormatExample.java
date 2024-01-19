package SemanasLessons.Semana5Lesson.Lesson1;

public class StringFormatExample {
    public static void main(String[] args) {
        String diez = String.valueOf(10);
        System.out.println(diez); //"10";
        System.out.println();
        String texto = "Hoy es lunes 13 de noviembre del 2023";
        System.out.format("texto = %s", texto);
        System.out.println();
        int once = 11;
        System.out.format("texto-> %d", once);
    }

}
