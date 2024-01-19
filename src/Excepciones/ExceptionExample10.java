package Excepciones;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class ExceptionExample10 {
    public static final String FAILED_TO_READ = "Unable to read file.";
    public static final String FAILED_TO_WRITE = "Unable to write to file.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {

        try{
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
            //escribe aquí tu código
        } catch (RuntimeException ex){
            if(ex.getCause() instanceof FileNotFoundException){
                System.out.println(FAILED_TO_READ);
            } else if(ex.getCause() instanceof FileSystemException){
                System.out.println(FAILED_TO_WRITE);
            }
        }

    }
}
