package Colecciones.Queue;

import java.util.Queue;

public class QueueExample01Main {
    public static void main(String[] args) {
        Queue<String> queue = new QueueExample01();

        for (int i = 0; i < 10; i++) {
            queue.offer("Element " + i);
        }
        System.out.println("Queue length: " + queue.size());

        System.out.println("*** iterator ***");
        for (Object o : queue) {
            System.out.println(o);
        }

        System.out.println("*** peek ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.peek());
        }

        System.out.println("*** poll ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.poll());
        }

        System.out.println("Queue length: " + queue.size());
    }
}
