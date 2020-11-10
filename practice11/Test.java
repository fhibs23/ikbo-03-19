package ru.mirea.practice11;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> arrayMod=new ArrayQueueModule<Integer>();
        ArrayQueueADT arrayADT=new ArrayQueueADT();
        for(int i=0;i<5;i++){
            arrayMod.add(i);
        }
        System.out.println(arrayMod.getArray());
        arrayMod.add(5);
        System.out.println(arrayMod.toString());
        arrayADT.enqueue(arrayMod.getArray(),100);
        LinkedQueue<Integer> arraylist=new LinkedQueue<>();

        for(int i=0;i<5;i++){
            arraylist.enqueue(i);
        }
        arraylist.print();
        arraylist.dequeue();
        System.out.println(arraylist.size());
        arraylist.print();
        arraylist.clear();
        arraylist.print();
    }
}
