package ru.mirea.Lab12;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println( pattern.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(pattern.matcher(str).matches());

    }
}
