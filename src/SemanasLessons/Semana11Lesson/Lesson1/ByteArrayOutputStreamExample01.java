package SemanasLessons.Semana11Lesson.Lesson1;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample01 {
    public static void main(String[] args) {
        FileOutputStream fout1= null;
        try {
            fout1 = new FileOutputStream("/Users/josesaidolanogarcia/DeleteMe/file01.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileOutputStream fout2= null;
        try {
            fout2 = new FileOutputStream("/Users/josesaidolanogarcia/DeleteMe/file02.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ByteArrayOutputStream bout =new ByteArrayOutputStream();
        bout.write(65);
        try {
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();//has no effect
            System.out.println("Success...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
