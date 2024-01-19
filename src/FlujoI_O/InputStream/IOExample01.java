package FlujoI_O.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IOExample01 {
    public static void main(String[] args) {
        //escribe aquí tu código
        //Escriba un programa que lea la ruta al file1 y la ruta al file2 de la consola. Luego, escribe todos los bytes de file1 a file2, pero al hacerlo, los intercambia según esta regla: intercambia el primero con el segundo, el tercero con el cuarto y así sucesivamente.
        //
        //Si el último byte en file1 es impar, entonces escríbalo en file2 tal como está. Para leer y escribir archivos, use FileInputStream y FileOutputStream.
        //
        //
        //Requirements:
        //1. El programa debe leer las rutas de archivos de la consola.
        //2. El programa debe reescribir los bytes de un archivo a otro de acuerdo con las condiciones de la tarea.
        //3. Para leer y escribir archivos, se deben usar FileInputStream y FileOutputStream.
        //4. Los flujos de lectura y escritura deben cerrarse.

        try(Scanner scanner = new Scanner(System.in); FileInputStream file1 = new FileInputStream(scanner.nextLine());
            FileOutputStream file2 = new FileOutputStream(scanner.nextLine())){
            byte [] buffer = file1.readAllBytes();
            byte [] byteOut = new byte[buffer.length];
            for(int i =0; i <= buffer.length - 1; i+=2){
                if(i<buffer.length-1) {
                    byteOut[i] = buffer[i + 1];
                    byteOut[i+1] = buffer[i];
                } else {
                    byteOut[i] = buffer[i];

                }

            }
            file2.write(byteOut);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
