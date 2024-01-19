package Colecciones.HashSet;

import java.util.HashSet;

public class HashSetExample01 {
    public static void main(String[] args) {
        String[] array = {"In", "three", "years", "I", "will be a", "senior", "Java", "developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //escribe aquí tu código
        HashSet<String> hashSet = new HashSet<>();
        for(String s : strings) {
            hashSet.add(s);
        }
        return hashSet;
    }
}
