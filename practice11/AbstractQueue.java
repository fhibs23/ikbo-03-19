package ru.mirea.practice11;

import java.util.List;

abstract class AbstractQueue<E> implements Queue<E> {
    protected List<E> queue;

    @Override
    public void enqueue() {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
