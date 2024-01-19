package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class For_EachExample01 {
    public static void printList(ArrayList<String> words) {
        for(String s : words) {
            System.out.println(s);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for(String s : words) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "I think this will be a new feature. Just don't tell anyone that it was an accident.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
