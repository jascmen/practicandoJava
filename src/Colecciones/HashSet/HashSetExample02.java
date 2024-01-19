package Colecciones.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample02 {
    public static void print(HashSet<String> words) {
        //escribe aquí tu código
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        print(words);
    }
}
