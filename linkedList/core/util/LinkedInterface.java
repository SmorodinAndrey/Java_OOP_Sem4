package linkedList.core.util;

public interface LinkedInterface<T> {
    void addFirst(T elem);

    void addLast(T elem);

    int size();

    T getElementByIndex(int index);
}