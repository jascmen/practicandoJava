package FlujoI_O.ByteArrayInputStreammmmmm;

import java.nio.charset.StandardCharsets;

public class ByteArrayInputStream {
    public static void main(String[] args) {
        java.io.ByteArrayInputStream stream = new java.io.ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(java.io.ByteArrayInputStream inputStream, int count) {
        //escribe aquí tu código
        byte [] bytes = inputStream.readAllBytes();
        int min = Math.min(bytes.length, count);
        char [] chars = new char[min];
        for (int i = 0; i < min; i++) {
            chars[i] = (char) bytes[i];
        }
        return chars;
    }
}
