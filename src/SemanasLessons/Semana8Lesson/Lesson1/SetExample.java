package SemanasLessons.Semana8Lesson.Lesson1;

import java.util.*;

//SOLID: principles of system design

public class SetExample {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        System.out.println(nombres.add("Enrique"));
        System.out.println(nombres.add("Juan"));
        System.out.println(nombres.add("Juan"));
        System.out.println(nombres.add("Said"));
        System.out.println("-----");
        System.out.println(nombres.contains("Juan"));
        System.out.println(nombres.size());
        System.out.println("-----");
        System.out.println(nombres.remove("Said"));
        System.out.println(nombres.contains("Said"));
        System.out.println(nombres.size());
        nombres.clear();
        System.out.println(nombres.size());

    }

}
