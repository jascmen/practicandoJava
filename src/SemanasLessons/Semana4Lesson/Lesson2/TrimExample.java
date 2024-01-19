package SemanasLessons.Semana4Lesson.Lesson2;

public class TrimExample {
    public static void main(String[] args) {
        String texto = "   Batman y Robin salieron de ciudad gotica a comer hamburguesas con queso   ";
        System.out.println(texto.length());
        texto = texto.trim();
        System.out.println(texto.length());
        System.out.println(texto);
    }
}
