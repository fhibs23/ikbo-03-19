package ru.mirea.practice10.Task2;

public class VictorianChair implements Chair{
    private int age;
    VictorianChair(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "VictorianChair{" +
                "age=" + age +
                '}';
    }
}
