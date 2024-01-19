package FlujoI_O.ByteArrayInputStreammmmmm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Example03 {
    public static void main(String[] args) throws IOException {
        System.out.println(writeData("Justinian", "Justinian@mega.city.one", 41, 391));
    }

    public static ByteArrayOutputStream writeData(String name, String email, int level, int rating) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        stream.write(("Name: " + name + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Email: " + email + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Level: " + level + "\n").getBytes(StandardCharsets.UTF_8));
        stream.write(("Rating: " + rating + "\n").getBytes(StandardCharsets.UTF_8));

        return stream;
    }
}
