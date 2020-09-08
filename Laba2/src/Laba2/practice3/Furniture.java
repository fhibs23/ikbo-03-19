package Laba2.practice3;

public abstract class Furniture {
    private String name;
    private String color;
    private int price;
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }

    public int getPrice() {
        return price;
    }
    public Furniture(String name, String color, int price)
    {
        this.name=name;
        this.color=color;
        this.price=price;
    }
    public abstract void displayInfo();
}
