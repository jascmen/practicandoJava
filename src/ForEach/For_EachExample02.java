package ForEach;

import java.util.ArrayList;
import java.util.Iterator;

public class For_EachExample02 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //escribe aquí tu código
        for(int  i =0; i<list.size(); i++) {
            if(list.get(i).toUpperCase().equals("BUG")) {
                list.remove(i);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //escribe aquí tu código
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().toUpperCase().equals("BUG")) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //escribe aquí tu código
        ArrayList<String> copy = new ArrayList<>(list);
        for(String s : copy) {
            if(s.toUpperCase().equals("BUG")) {
                list.remove(s);
            }
        }
    }
}
