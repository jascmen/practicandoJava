package SemanasLessons.Semana8Lesson.Lesson1;

import java.util.*;

public class ArrayListVersusLinkedList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Adding Time : " + addElement(list, 1000));
        System.out.println("Adding Time : " + addElement(list, 2));
        System.out.println(list);
        System.out.println("Accessing Time : " + accessElement(list, 1));
        System.out.println("Removing Time : " + removeElement(list, 1));
        System.out.println(list);

        System.out.println("-------------------------------------------------------");
        list = new LinkedList<>();
        System.out.println("Adding Time : " + addElement(list, 1000));
        System.out.println("Adding Time : " + addElement(list, 2));
        System.out.println(list);
        System.out.println("Accessing Time : " + accessElement(list, 1));
        System.out.println("Removing Time : " + removeElement(list, 1));
        System.out.println(list);
    }

    static long addElement(List<Integer> list, int element) {
        long starttime = System.nanoTime();
        list.add(element);
        long endtime = System.nanoTime();
        return (endtime - starttime);
    }

    static long accessElement(List<Integer> list, int index) {
        long starttime = System.nanoTime();
        int el = list.get(index);
        System.out.println("Element found : " + el);
        long endtime = System.nanoTime();
        return (endtime - starttime);
    }

    static long removeElement(List<Integer> list, int index) {
        long starttime = System.nanoTime();
        list.remove(index);
        long endtime = System.nanoTime();
        return (endtime - starttime);
    }

}

