package Colecciones.HashMap;

import java.util.HashMap;

public class HashMapExample04 {
    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<Integer,String> getProgrammingLanguages() {
        //escribe aquí tu código
        HashMap<Integer,String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0,"Java");
        programmingLanguages.put(1,"Kotlin");
        programmingLanguages.put(2,"Go");
        programmingLanguages.put(3,"Javascript");
        programmingLanguages.put(4,"Typescript");
        programmingLanguages.put(5,"Python");
        programmingLanguages.put(6,"PHP");
        programmingLanguages.put(7,"C++");
        return programmingLanguages;
    }
}
