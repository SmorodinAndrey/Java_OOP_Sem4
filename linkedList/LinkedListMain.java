package linkedList;

import linkedList.core.lists.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(2);
        linkedList.addLast(5);
        linkedList.addFirst(1);
        linkedList.addLast(7);

        System.out.println("Size of linkedList: " + linkedList.size());

        System.out.println("Element at index 0: " + linkedList.getElementByIndex(0));
        System.out.println("Element at index 1: " + linkedList.getElementByIndex(1));
        System.out.println("Element at index 2: " + linkedList.getElementByIndex(2));
        System.out.println("Element at index 3: " + linkedList.getElementByIndex(3));
    }
}
