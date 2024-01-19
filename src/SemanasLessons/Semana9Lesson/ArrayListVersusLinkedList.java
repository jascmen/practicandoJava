package SemanasLessons.Semana9Lesson;

import java.util.*;

public class ArrayListVersusLinkedList {

    static int SIZE = 100000;

    public static void main(String[] args) {
        long starttime = System.nanoTime();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<SIZE;i++){
            list.add(i);
        }
        long endtime = System.nanoTime();
        long result = (endtime - starttime);
        System.out.println("resultado para la adición de elementos en un ArrayList: " + result);

        starttime = System.nanoTime();
        for(int i=0;i<SIZE;i++){
            list.set(i,100);
        }
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la setting de elementos en un ArrayList: " + result);


        starttime = System.nanoTime();
        list.add(50000,5);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la inserción de 1 elemento en un ArrayList: " + result);


        starttime = System.nanoTime();
        int elemento = list.get(50000);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la obtención de 1 elemento en un ArrayList: " + result);

        starttime = System.nanoTime();
        elemento = list.remove(list.size()-1);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la eliminación de 1 elemento en un ArrayList: " + result);

        System.out.println("-------------------------------------------------------");

        starttime = System.nanoTime();
        list = new LinkedList<Integer>();
        for(int i=0;i<SIZE;i++){
            list.add(i);
        }
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la adición de elementos en un LinkedList: " + result);

        starttime = System.nanoTime();
        for(int i=0;i<SIZE;i++){
            list.set(i,100);
        }
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la setting de elementos en un LinkedList: " + result);

        starttime = System.nanoTime();
        list.add(50000,5);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la inserción de 1 elemento en un LinkedList: " + result);

        starttime = System.nanoTime();
        elemento = list.get(50000);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la obtención de 1 elemento en un LinkedList: " + result);

        starttime = System.nanoTime();
        elemento = list.remove(list.size()-1);
        endtime = System.nanoTime();
        result = (endtime - starttime);
        System.out.println("resultado para la eliminación de 1 elemento en un LinkedList: " + result);

    }


}

