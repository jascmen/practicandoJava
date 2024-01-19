package Excepciones;

public class ExceptionExample09 {
    public static final String OUTPUT_FORMAT = "El método %s fue llamado en la línea %d de la %s clase en el archivo %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //escribe aquí tu código
        for(StackTraceElement stackTraceElement : stackTrace){
            System.out.printf(OUTPUT_FORMAT,stackTraceElement.getMethodName(),stackTraceElement.getLineNumber(),stackTraceElement.getClassName(),stackTraceElement.getFileName());
            //System.out.println("El metodo"+stackTraceElement.getMethodName()+" fue llamado en la linea "+stackTraceElement.getLineNumber()+" de la clase "+stackTraceElement.getClassName()+" en el archivo "+stackTraceElement.getFileName());
        }

    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
