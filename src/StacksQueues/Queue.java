package StacksQueues;

public class Queue {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLinkedList(5);
        list.addLinkedList(10);
        list.addLinkedList(15);
        list.addLinkedList(20);
        list.diaplay();

        System.out.println(" After Delete Queue from begining ");
        list.deleteFirst();
        list.deleteFirst();
        list.diaplay();

    }
}
