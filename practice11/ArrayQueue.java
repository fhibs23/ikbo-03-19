package ru.mirea.practice11;

import java.util.ArrayList;

public class ArrayQueue<E> extends AbstractQueue<E>{
    private ArrayList<E> array;
    ArrayQueue(ArrayList<E> array){
        this.array=array;
    }
    public E element(){
        return array.get(0);
    }
    public int size(){
        return array.size();
    }
    public boolean isEmpty(){
        return array.isEmpty();
    }
    public void clear(){
        array.clear();
    }
    public void enqueue(E n){
        array.add(n);
    }
    public E dequeue() {
        E firstEl = element();
        array.remove(0);
        return firstEl;
    }
}
