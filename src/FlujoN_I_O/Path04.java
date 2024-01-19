package FlujoN_I_O;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path04 {
    public static Path rpmLogPath;

    public static void main(String[] args) throws URISyntaxException {
        //escribe aquí tu código
        rpmLogPath = Paths.get(new URI("file:/usr/lib/rpm/rpm.log"));

    }
}
