package SemanasLessons.Semana9Lesson;

import java.util.*;

public class QueueExample {

    public static void main(String[] args) {
        //Queue<String> queue = new PriorityQueue<>(); // PriorityQueue es una implementación de Queue que ordena los elementos de acuerdo a su prioridad
        Queue<String> queue = new ArrayDeque<>() ; // ArrayDeque es una implementación de Queue que utiliza un arreglo para almacenar los elementos
        queue.add("uno");
        queue.add("dos");
        queue.add("tres");
        queue.add("atres");

        queue.offer("ados"); // offer es como add, pero no lanza excepción si no se puede agregar el elemento

        System.out.println(queue);
    }

}
