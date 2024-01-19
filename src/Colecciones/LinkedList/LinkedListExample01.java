package Colecciones.LinkedList;

public class LinkedListExample01 {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }



    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        // Si la lista está vacía, el nuevo nodo será tanto el primer como el último nodo
        if (first.next == null) {
            first.next = newNode;
            newNode.prev = first;
            last.prev = newNode;
            newNode.next = last;
        } else {
            // Agregar el nuevo nodo al final de la lista
            newNode.prev = last.prev;
            last.prev.next = newNode;
            newNode.next = last;
            last.prev = newNode;
        }
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }


}
