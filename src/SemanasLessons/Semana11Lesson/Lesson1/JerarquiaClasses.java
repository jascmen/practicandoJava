package SemanasLessons.Semana11Lesson.Lesson1;

import java.io.*;

public class JerarquiaClasses {
    public static void main(String[] args) {
        //InputStream is = System.in;
        //InputStreamReader isr = new InputStreamReader(is);
        //BufferedReader br = new BufferedReader(isr);
        //String linea = br.readLine();

        //String linea = new BufferedReader(new InputStreamReader(System.in)).readLine();
        //System.out.println("Linea leida: " + linea);
        BufferedInputStream buffInputStr = null;
        try {
            buffInputStr = new BufferedInputStream(
                    new FileInputStream("/Users/josesaidolanogarcia/DeleteMe/file01.txt")
            );

            // Read until a single byte is available
            while (buffInputStr.available() > 0) {

                // Read the byte and
                // convert the integer to character
                char c = (char) buffInputStr.read();

                // Print the characters
                System.out.println("Char : " + c);
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            buffInputStr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
