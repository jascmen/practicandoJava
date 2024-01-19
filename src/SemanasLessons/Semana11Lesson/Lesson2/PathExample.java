package SemanasLessons.Semana11Lesson.Lesson2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("/users/josesaidolanogarcia/JavaDesdeCero.pdf");
        Path path2 = Paths.get("/users/DeleteMe/file01");
        Path path3 = Path.of("/users/DeleteMe/file01");
        System.out.println(path3.getParent());
        System.out.println(path3.getFileName());
        System.out.println(path3.getRoot());
        System.out.println(path3.toAbsolutePath());
        System.out.println(path3.normalize());
        System.out.println(path3.resolve(path2));
        System.out.println(path2.toAbsolutePath());
        System.out.println(path3.getNameCount());
        System.out.println(path3.getName(2));
        System.out.println(path3.toFile().isDirectory());

        System.out.println(path3.toAbsolutePath());
    }

}
