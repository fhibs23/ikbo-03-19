package ru.mirea.practice8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            System.out.print("list: ");
            for (int i = 0; i < 10; i++) {
                list.add(i+1);
            }
            for(int i=0;i<10;i++){
                if(i<9)
                    System.out.print(list.get(i) +" ");
                else System.out.print(list.get(i));
            }
            WaitList<Integer> boundedlist = new BoundedWaitList<>(10);
            for (int i = 0; i < 10; i++)
                boundedlist.add(i+1);
            System.out.println(boundedlist);
            UnfairWaitList<Integer> unfairlist = new UnfairWaitList<>();
            for (int i = 0; i < 10; i++)
                unfairlist.add(i+1);
            System.out.println(unfairlist);

        }
}
