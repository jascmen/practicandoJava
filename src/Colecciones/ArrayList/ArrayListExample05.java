package Colecciones.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample05 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //escribe aquí tu código
        programmingLanguages.remove("Pascal");
    }
}
