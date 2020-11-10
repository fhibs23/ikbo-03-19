package ru.mirea.practice10.Task2;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("Magic!!");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
