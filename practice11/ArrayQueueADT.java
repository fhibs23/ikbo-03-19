package ru.mirea.practice11;

import java.util.ArrayList;

public class ArrayQueueADT<E> {
    public E element(ArrayList<E> array){
        return array.get(0);
    }
    public int size(ArrayList<E> array){
        return array.size();
    }
    public boolean isEmpty(ArrayList<E> array){
        return array.isEmpty();
    }
    public void clear(ArrayList<E> array){
        array.clear();
    }
    public void enqueue(ArrayList<E> array, E n){
        array.add(n);
    }
    public E dequeue(ArrayList<E> array){
        E firstEl=element(array);
        array.remove(0);
        return firstEl;

    }

}
