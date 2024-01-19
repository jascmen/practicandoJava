package SemanasLessons.Semana10Lesson.Lesson02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaTryWithResourcesExample {
    public static void main(String[] args) {
        String archivo = "/Users/josesaidolanogarcia/CodeGymJavaCodes/said.txt";
        try {
            String linea = readFirstLineFromFile(archivo);
            System.out.println("linea: " + linea);
        } catch (IOException e) {
            System.out.println("Exception 111: " + e.getMessage());
        }
    }

    static String readFirstLineFromFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String linea = null;
        try {
            linea =  br.readLine();
            linea =  br.readLine();
        }catch(Exception e){
            System.out.println("E");
        }finally{
            System.out.println("siempre!");
            br.close();
            br.close();
        }
        return linea;
    }

}
