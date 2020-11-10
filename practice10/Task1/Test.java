package ru.mirea.practice10.Task1;

public class Test {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 5);
        System.out.println(complex1);
        ComplexAbstractFactory complex2=new ConcreteFactory();
        Complex complex3=complex2.CreateComplex(15,7);
        System.out.println(complex3);
        ConcreteFactory complex4=new ConcreteFactory();
        Complex complex5=complex4.CreateComplex(10,23);
        System.out.println(complex5);
    }
}
