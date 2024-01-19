package SemanasLessons.Semana11Lesson.Lesson2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {
        //initialize Path object
        Path path = Paths.get("/users/josesaidolanogarcia/JavaDesdeCeroSaidVersion.txt");
        Path directoryPath = Paths.get("/users/josesaidolanogarcia/newFolder123");
        //create file
        try {
            Path createdFilePath = Files.createFile(path);
            Path directoryCreatedPath = Files.createDirectory(directoryPath);
            System.out.println("directoryCreatedPath.getFileName(): " + directoryCreatedPath.getFileName() );
            System.out.println("File Created at Path : "+createdFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
