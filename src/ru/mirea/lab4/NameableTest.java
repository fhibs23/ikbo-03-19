package ru.mirea.lab4;

public class NameableTest {
    public static void main(String[] args) {
    Nameable car1=new Car("BMV");
    Car car2=new Car("Audi");
    Planet planet1=new Planet("Earth");
    Planet planet2=new Planet("Mars");
    Animal animal1=new Animal("alpaka");
    Animal animal2=new Animal("lama");
    System.out.println(car1.getName());
    System.out.println(car2.getName());
    System.out.println(planet1.getName());
    System.out.println(planet2.getName());
    System.out.println(animal1.getName());
    System.out.println(animal2.getName());
    }
}
