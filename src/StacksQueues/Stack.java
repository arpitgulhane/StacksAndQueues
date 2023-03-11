package StacksQueues;

public class Stack {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.addLinkedList(10);
        list.addLinkedList(20);
        list.addLinkedList(30);
        list.addLinkedList(40);

        list.diaplay();
//-------------peek , pop last element (delete last ) ------------
        list.peekLast();
        list.deleteLast();
        list.peekLast();
        list.deleteLast();
        list.peekLast();
        list.deleteLast();
        System.out.println("---- After pop Last value ------");
        list.diaplay();

    }
}
