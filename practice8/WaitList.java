package ru.mirea.practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * @param <E> - generic type for list
 */
public abstract class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    public WaitList(){
        this.content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<E> c){
        this.content = new ConcurrentLinkedQueue<>(content);
    }
    public String toString(){
        return "WaitList content: "+content;
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
