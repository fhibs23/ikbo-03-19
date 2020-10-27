package ru.mirea.Lab9;

import java.util.Scanner;
public class ThrowsDemo {
    private String getDetails(String key) throws Exception {
    if (key.equals("")) {
        throw new Exception("Key set to empty string, so enter another key");
    }
    return "data for " + key;
}
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            getKey();
        }
    }

    public static void main(String[] args) {
        ThrowsDemo e=new ThrowsDemo();
        e.getKey();
    }
}
