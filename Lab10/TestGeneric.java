package ru.mirea.Lab10;

public class TestGeneric {
    public static void main(String[] args) {
        String[] str={"a","b","c","d"};
        Conversion<String> list=new Conversion<>(str);
        list.print();
        Integer[] numb={0,1,2,3,4,5};
        Conversion<Integer> list2 =new Conversion<>(numb);
        list2.print();
    }
}
