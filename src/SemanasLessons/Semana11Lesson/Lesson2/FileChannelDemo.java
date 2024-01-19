package SemanasLessons.Semana11Lesson.Lesson2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class FileChannelDemo {
    public static void main(String args[]) throws IOException {
        //append the content to existing file
        ByteBuffer byteBuffer = ByteBuffer.wrap("Welcome to TutorialsPoint".getBytes());
        writeFileChannel(byteBuffer);
        //read the file
        readFileChannel();
    }
    public static void readFileChannel() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/josesaidolanogarcia/DeleteMe/file03.txt",
                "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(50);
        Charset charset = Charset.forName("US-ASCII");
        while (fileChannel.read(byteBuffer) > 0) {
            byteBuffer.rewind();
            System.out.print(charset.decode(byteBuffer));
            byteBuffer.flip();
        }
        fileChannel.close();
        randomAccessFile.close();
    }
    public static void writeFileChannel(ByteBuffer byteBuffer)throws IOException {
        Set<StandardOpenOption> options = new HashSet<>();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);
        Path fileWithPath = Paths.get("/Users/josesaidolanogarcia/DeleteMe/file03.txt");
        FileChannel fileChannel = FileChannel.open(fileWithPath, options);
        fileChannel.write(byteBuffer);
        fileChannel.close();
    }
}