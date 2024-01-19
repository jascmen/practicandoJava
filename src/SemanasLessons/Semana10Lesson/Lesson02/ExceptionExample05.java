package SemanasLessons.Semana10Lesson.Lesson02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample05 {
    public static void main(String[] args) {
        String archivo = "/Users/josesaidolanogarcia/CodeGymJavaCodes/said.txt";
        try{
            verificarSaldo();
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("---> muy util para debuggear");
            e.printStackTrace();
        }
        System.out.println("****");
        try{
            crearArchivo(archivo);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try{
            metodo11();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void metodo11() throws RuntimeException, Exception, FileNotFoundException{
        boolean llantaPonchada = true;
        boolean databaseCaida = true;
        boolean archivoNoEncontrado = true;

        if(databaseCaida)
            throw new RuntimeException("La base de datos esta fuera de linea");
        if(archivoNoEncontrado)
            throw new FileNotFoundException("El archivo x no fue encontrado");
        if(llantaPonchada)
            throw new Exception("Tu llanta esta ponchada");
    }

    private static boolean crearArchivo(String path) throws IOException {
        System.out.println("Creando el archivo...");
        return new File(path).createNewFile();
    }

    static private void verificarSaldo()throws Exception{
        //1000
        int saldo = 995;
        saldo = saldo + 15;
        if(saldo>1000)
            throw new Exception("Te acabaste la lana para gastar");
    }
}
