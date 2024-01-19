package FlujoN_I_O;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Buffer02 {
    public static void main(String[] args) throws Exception {
        splitFile("C:\\test\\file.txt", 1024);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            //escribe aquí tu código
            ByteBuffer buffer = ByteBuffer.allocate(partSize);
            int partNumber = 0;
            while (inputChannel.read(buffer) > 0) {
                buffer.flip();
                Path newFile = Paths.get(getNewFileName(fileName, ++partNumber));
                try (FileChannel outputChannel = FileChannel.open(newFile, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                    outputChannel.write(buffer);
                }
                buffer.clear();
            }

        }
    }

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
