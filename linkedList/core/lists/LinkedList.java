package linkedList.core.lists;

import java.util.Iterator;

import linkedList.core.util.LinkedInterface;
import linkedList.core.util.Node;

public class LinkedList<T> implements Iterable<T>, LinkedInterface<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.getCurrentElement();
                currentNode = currentNode.getNext();
                return data;
            }
        };
    }

    @Override
    public void addFirst(T elem) {
        Node<T> newNode = new Node<>(null, elem, head);
        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    @Override
    public void addLast(T elem) {
        Node<T> newNode = new Node<>(tail, elem, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getElementByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        int counter = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (counter == index) {
                return currentNode.getCurrentElement();
            }
            currentNode = currentNode.getNext();
            counter++;
        }

        throw new IndexOutOfBoundsException();
    }
}
