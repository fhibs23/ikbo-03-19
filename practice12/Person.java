package ru.mirea.practice12;

public class Person {
    private String name, middleName, surName;

    Person(String name, String middleName, String surName) {
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
    }

    Person(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        if (name == null || middleName == null) {
            return surName;
        } else return surName +" "+ name.toCharArray()[0] + ". " + middleName.toCharArray()[0] + ".";
    }

    public static void main(String[] args) {
        Person person1=new Person("Snow");
        System.out.println(person1.toString());
        person1=new Person("Alex","Alexandrovich","Peter");
        System.out.println(person1.toString());
    }
}