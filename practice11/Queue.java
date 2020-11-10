package ru.mirea.practice11;

interface Queue<E> {
    void enqueue();
    E dequeue();
    E element();
    int size();
    boolean isEmpty();
    void clear();

}
