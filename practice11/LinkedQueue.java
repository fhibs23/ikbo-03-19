package ru.mirea.practice11;

import java.util.LinkedList;

public class LinkedQueue <E> extends AbstractQueue<E>{
    private LinkedList<E> link;
    LinkedQueue(){
        link=new LinkedList<E>();
    }
    public E element(){
       return link.peek();
    }
    public int size(){
        return link.size();
    }
    public boolean isEmpty(){
        return link.isEmpty();
    }
    public void clear(){
        link.clear();
    }
    public void enqueue(E n){
        link.add(n);
    }
    public E dequeue(){
        return link.poll();
    }
    public void print(){
        System.out.println(link);
    }
}
