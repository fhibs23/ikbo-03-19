package ru.mirea.Lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Conversion<E> {
    private List<E> list=new ArrayList<>();
    public Conversion(E[] array){
        list.addAll(Arrays.asList(array));
    }
    public void add(E element){
        list.add(element);
    }
    public void print(){
        for(Object list1: list){
            System.out.print(list1+" ");
        }
        System.out.println();
    }
    public List getList(){
        return list;
    }
}
