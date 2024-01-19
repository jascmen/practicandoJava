package Colecciones.LinkedList;

public class LinkedListExample02 {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        //escribe aquí tu código
        Node node = new Node();
        Node temp = first.next;
        int i = 0;
        while(temp!=null){
            node.value = temp.value;
            temp = temp.next;
            if(i==index){
                return node.value;
            }
            i++;
        }
        return null;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
