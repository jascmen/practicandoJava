package SemanasLessons.Semana10Lesson.Lesson02;

import java.io.File;
import java.io.IOException;

public class ExceptionExample03 {
    public static void main(String[] args) {
        String archivo = "C:\\Users\\JORGE ANTHONY\\Desktop\\miArchivo.txt";
        boolean fileCreated = createFolder(archivo);
        System.out.println("El archivo fue creado: " + fileCreated);
    }

    public static boolean createFolder(String archivo){
        boolean newFile = false;
        try {
            newFile = new File(archivo).createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return newFile;
    }
}
