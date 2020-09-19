package ru.mirea.lab4;

public class Animal implements Nameable {
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
