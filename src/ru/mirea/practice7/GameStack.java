package ru.mirea.practice7;

import java.util.*;

public class GameStack {
    public static void main(String[] args) {
        int[] arr1= new int[5];
        int[] arr2 = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            int value = input.nextInt();
            arr1[i] = value;
        }
        input = new Scanner(System.in);
        for (int i=0;i<5;i++) {
            int value = input.nextInt();
            arr2[i] = value;
        }
        System.out.print("Task 1. Game on Stack:\n");
        stack(arr1, arr2);
        System.out.print("\nTask 2. Game on Queue:\n");
        queue(arr1, arr2);
        System.out.print("\nTask 3. Game on Dequeue:\n");
        dequeue(arr1, arr2);
    }
    public static void stack (int []play_1, int [] play_2) {
        Stack<Integer> pl1 = new Stack<Integer>();
        Stack<Integer> pl2 = new Stack<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        int quantity = 0;
        for (int i = 4; i > -1; i--) {
            pl1.push(play_1[i]);
            pl2.push(play_2[i]);
        }
        while (!pl1.empty() && !pl2.empty()) {
            if (quantity != 106) {
                quantity++;
                if (pl1.peek() == 0 && pl2.peek() == 9) {
                    stack.push(pl1.pop());
                    stack.push(pl2.pop());
                    stack.addAll(pl1);
                    pl1.clear();
                    pl1.addAll(stack);
                    stack.clear();
                } else if (pl1.peek() == 9 && pl2.peek() == 0) {
                    stack.push(pl1.pop());
                    stack.push(pl2.pop());
                    stack.addAll(pl2);
                    pl2.clear();
                    pl2.addAll(stack);
                    stack.clear();
                } else if (pl1.peek() > pl2.peek()) {
                    stack.push(pl1.pop());
                    stack.push(pl2.pop());
                    stack.addAll(pl1);
                    pl1.clear();
                    pl1.addAll(stack);
                    stack.clear();
                } else if (pl1.peek() < pl2.peek()) {
                    stack.push(pl1.pop());
                    stack.push(pl2.pop());
                    stack.addAll(pl2);
                    pl2.clear();
                    pl2.addAll(stack);
                    stack.clear();
                }
                if (!pl1.empty()) {
                    System.out.print("first " + quantity);
                } else if (!pl2.empty()) {
                    System.out.print("second " + quantity);
                }
            }
            else {
                System.out.print("botva");
                break;
            }
        }
    }

    public static void queue (int []play_1, int []play_2) {
        Queue<Integer> pl1 = new LinkedList<Integer>();
        Queue<Integer> pl2 = new LinkedList<Integer>();
        int quantity=0;
        for (int i=0;i<5;i++) {
            pl1.add(play_1[i]);
            pl2.add(play_2[i]);
        }
        while (pl1.size()!=0 && pl2.size()!=0) {
            if (quantity != 106) {
                quantity++;
                if (pl1.peek() == 0 && pl2.peek() == 9) {
                    pl1.add(pl1.remove());
                    pl1.add(pl2.remove());
                } else if (pl1.peek() == 9 && pl2.peek() == 0) {
                    pl2.add(pl1.remove());
                    pl2.add(pl2.remove());
                } else if (pl1.peek() > pl2.peek()) {
                    pl1.add(pl1.remove());
                    pl1.add(pl2.remove());
                } else if (pl1.peek() < pl2.peek()) {
                    pl2.add(pl1.remove());
                    pl2.add(pl2.remove());
                }
            }
            else {
                System.out.print("botva");
                break;
            }
        }
        if(pl1.size()==0) {
            System.out.print("second "+quantity);
        }
        else if (pl2.size()==0) {
            System.out.print("first "+quantity);
        }
    }

    public static void dequeue(int []play_1, int [] play_2)  {
        Deque<Integer> pl1 =  new LinkedList<Integer>();
        Deque<Integer> pl2 = new LinkedList<Integer>();
        int quantity=0;
        for (int i=0;i<5;i++) {
            pl1.add(play_1[i]);
            pl2.add(play_2[i]);
        }
        while (pl1.size()!=0 && pl2.size()!=0) {
            if (quantity != 106) {
                quantity++;
                if (pl1.peek() == 0 && pl2.peek() == 9) {
                    pl1.add(pl1.remove());
                    pl1.add(pl2.remove());
                } else if (pl1.peek() == 9 && pl2.peek() == 0) {
                    pl2.add(pl1.remove());
                    pl2.add(pl2.remove());
                } else if (pl1.peek() > pl2.peek()) {
                    pl1.add(pl1.remove());
                    pl1.add(pl2.remove());
                } else if (pl1.peek() < pl2.peek()) {
                    pl2.add(pl1.remove());
                    pl2.add(pl2.remove());
                }
            }
            else {
                System.out.print("botva");
                break;
            }
        }
        if(pl1.size()==0) {
            System.out.print("second "+quantity);
        }
        else if (pl2.size()==0) {
            System.out.print("first "+quantity);
        }
    }

}

