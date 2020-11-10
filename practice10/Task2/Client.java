package ru.mirea.practice10.Task2;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Sitting on "+chair.toString());
    }
    public void setChair(Chair chair){
        this.chair=chair;
    }
}
