package Laba2.practice3;

public class Chair extends Furniture {
    public Chair(String name, String color, int price) {
        super(name, color, price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void displayInfo() {
        System.out.println("Furniture: "+super.getName()+"/ Color: "+super.getColor()+"/ Price: "+super.getPrice());
    }
}
