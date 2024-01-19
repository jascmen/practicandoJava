package SemanasLessons.Semana10Lesson.Lesson02;

import java.io.File;
import java.io.IOException;

public class ExceptionExample04 {
    public static void main(String[] args) {
        String archivo = "/Users/josesaidolanogarcia/CodeGymJavaCodes/said.txt";
        boolean saldoOK = false;
        boolean archivoCreado = false;
        try {
            verificarSaldo();
            System.out.println("Saldo verificado");
            archivoCreado = crearArchivo(archivo);
            System.out.println("Archivo creado");
        } catch (IOException e) {
            System.out.println("IO" + e.getMessage());
        } catch (Exception e) {
            System.out.println("E " + e.getMessage());
        }
        System.out.println("OK");
    }

    private static boolean crearArchivo(String path) throws IOException {
        System.out.println("Creando el archivo...");
        new File(path).createNewFile();
            return true;
    }

    static private void verificarSaldo()throws Exception{
        //1000
        int saldo = 995;
        saldo = saldo + 15;
        if(saldo>1000)
            throw new Exception("Te acabaste la lana para gastar");
    }

}
