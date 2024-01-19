package Excepciones;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploThrowYThrows {
    public static void main(String[] args) {
        try {
            procesarArchivo("C:\\Users\\JORGE ANTHONY\\Desktop\\miArchivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }

    public static void procesarArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        FileReader lector = null;
        try {
            // Intentar abrir el archivo
            lector = new FileReader(nombreArchivo);

            // Simular un error durante la lectura
            char[] buffer = new char[1024];
            if (lector.read(buffer) < 0) {
                // Lanzar una excepción si la lectura falla
                throw new IOException("Error durante la lectura del archivo");
            }

            // Otro error simulado
            if (nombreArchivo.equals("archivo_prohibido.txt")) {
                throw new IllegalArgumentException("No se permite procesar este archivo");
            }

            // Código para procesar el archivo (simulado)
            System.out.println("Archivo procesado correctamente");
        } finally {
            // Cerrar el lector en el bloque finally para garantizar la liberación de recursos
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    // Manejar cualquier excepción al cerrar el lector
                    System.out.println("Error al cerrar el lector: " + e.getMessage());
                }
            }
        }
    }
}
