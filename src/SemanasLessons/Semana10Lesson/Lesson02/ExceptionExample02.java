package SemanasLessons.Semana10Lesson.Lesson02;

import java.io.File;
import java.io.IOException;

public class ExceptionExample02 {
    public static void main(String[] args) throws IOException {
        String texto = null;
        try {
            texto = cambiaTexto(texto);
            System.out.println(texto.length());
            int x = miDivision(10, 0);
            System.out.println("X: "+x);

            String archivo = "C:\\Users\\JORGE ANTHONY\\Desktop\\mitext.txt";
            boolean result = createFolder(archivo);
            System.out.println("Resultado: "+result);
        } catch (ArithmeticException ae){
            System.out.println("Operacion Matematica no soportada: " + ae.getMessage());
            //System.exit(-1);
        } catch (NullPointerException np) {
            System.out.println("No se puede llevar a cabo con un valor nulo: " + np.getMessage());
            //System.exit(-1);
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            //System.exit(-1);
        }
        finally {
            System.out.println("Finally se ejecuta siempre");
        }

        System.out.println("Aqui sigue el programa");



    }
    private static String cambiaTexto(String texto) {
        String resultado = null;
        resultado = texto.toUpperCase();
        System.out.println("Error al convertir a mayúsculas");
        return resultado;
    }

    public static int miDivision(int a, int b){
        return a/b;
    }

    public static boolean createFolder(String path) throws IOException {
        return new File(path).createNewFile();
    }
}
