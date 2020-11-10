package ru.mirea.practice10.Task1;

public class Complex {
    private int real,image;
    public Complex(){};
    public Complex(int real,int image){
        this.real=real;
        this.image=image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
