package ru.mirea.Lab9;

import java.util.Scanner;

public class Exeption1 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e){
            System.err.println("Not an integer");
        }
}
    public void exceptionDemo2() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NullPointerException ex){
            System.err.println("Not an integer");
        }
        finally {
            System.err.println("Error");
        }
    }

    public static void main(String[] args) {
        Exeption1 e=new Exeption1();
        e.exceptionDemo();
    }
}
