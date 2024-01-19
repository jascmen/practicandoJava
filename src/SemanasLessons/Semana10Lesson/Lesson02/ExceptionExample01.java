package SemanasLessons.Semana10Lesson.Lesson02;

public class ExceptionExample01 {
    public static void main(String[] args) {
        String texto = null;
        texto = cambiaTexto(texto);
        //System.out.println(texto);
        try {
            System.out.println(texto.length());
        } catch (NullPointerException npe) {
            //System.err.println("Exception found: " + npe.getMessage());//esto retorna el mensaje de error
            System.err.println("Error al enviar un valor nulo a length()");//esto retorna la causa del error
        }
    }
    private static String cambiaTexto(String texto) {
        String resultado = null;
        try {
            resultado = texto.toUpperCase();
        } catch (Exception e) {
            System.err.println("Exception found: " + e.getMessage());//esto retorna el mensaje de error
            System.err.println("Exception cause: " + e.getCause());//esto retorna la causa del error
        }
        return resultado;
    }
}
