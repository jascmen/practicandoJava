package SemanasLessons.Semana4Lesson.Lesson2;

public class ReplaceAllExample {
    public static void main(String[] args) {
        String texto = "Batman y Robin salieron de ciudad gotica a comer hamburguesas con queso";
        texto = texto.replaceAll("a","A");
        System.out.println(texto);
    }
}
