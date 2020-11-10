package ru.mirea.practice11;

import java.util.ArrayList;

public class ArrayQueueModule<E> {
    private ArrayList<E> array = new ArrayList<E>();
    public ArrayQueueModule(){};
    public void add(E num){
        array.add(num);
    }
    public ArrayList<E> getArray(){
        return array;
    }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "array=" + array +
                '}';
    }
}
