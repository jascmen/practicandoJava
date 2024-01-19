package FlujoI_O.ByteArrayInputStreammmmmm;

import java.io.ByteArrayOutputStream;

public class Example02 {
    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        byte[] bytes = message.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length / 2; i++) {
            stream.write(bytes[i]);
            stream.write(bytes[length - i - 1]);
        }
        if (length % 2 == 1) {
            stream.write(bytes[length / 2]);
        }

        return stream;
    }
}
