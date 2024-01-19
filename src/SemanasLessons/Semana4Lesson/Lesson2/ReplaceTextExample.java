package SemanasLessons.Semana4Lesson.Lesson2;

public class ReplaceTextExample {
    public static void main(String[] args) {
        String texto = "Batman y Robin salieron de ciudad gotica a comer hamburguesas con queso";
         //texto = texto.replace("q", "X");
         //texto = texto.replace("i", "Y");
         texto = texto.replace("q", "X").replace("i", "Y").toUpperCase();
        System.out.println(texto);
    }
}
