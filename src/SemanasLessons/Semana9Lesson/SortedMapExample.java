package SemanasLessons.Semana9Lesson;

import java.util.*;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<Integer, String>(); // TreeMap es una implementación de SortedMap que utiliza un árbol para almacenar los elementos
        sm.put(2, "practice");
        sm.put(3, "quiz");
        sm.put(3, "code");
        sm.put(4, "contribute");
        sm.put(1, "geeksforgeeks");
        Set s = sm.entrySet();

        // Using iterator in SortedMap
        Iterator i = s.iterator();

        // Traversing map. Note that the traversal
        // produced sorted (by keys) output .
        while (i.hasNext()) {
            Map.Entry m = (Map.Entry) i.next();

            int key = (Integer) m.getKey();
            String value = (String) m.getValue();

            System.out.println("Key : " + key
                    + "  value : " + value);
        }
    }
}