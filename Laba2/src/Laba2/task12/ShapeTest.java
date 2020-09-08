package Laba2.task12;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "red", true);
        Rectangle rectangle = new Rectangle(10, 5, "black", false);
        Square square = new Square(10, "blue", true);
        System.out.println(circle.toString() + " " + circle.getArea() + " " + circle.getPerimeter());
        System.out.println(rectangle.toString() + " " + rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(square.toString() + " " + square.getArea() + " " + square.getPerimeter());
    }
}
