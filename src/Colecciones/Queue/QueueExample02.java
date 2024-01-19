package Colecciones.Queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample02 {
    public static Queue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('M', 'H', 'R', 'W', 'C', 'V', 'S', 'A', 'F', 'N', 'Z', 'B', 'W', 'K', 'O', 'U', 'G', 'P', 'I', 'E', 'T', 'X', 'L'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
