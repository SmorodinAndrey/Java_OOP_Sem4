package linkedList.core.util;

public class Node<T> {
    private T currentElement;
    private Node<T> next;
    private Node<T> previous;

    public Node(Node<T> previous, T currentElement, Node<T> next) {
        this.currentElement = currentElement;
        this.next = next;
        this.previous = previous;
    }

    public void setCurrentElement(T currentElement) {
        this.currentElement = currentElement;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getCurrentElement() {
        return currentElement;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrevious() {
        return previous;
    }
}