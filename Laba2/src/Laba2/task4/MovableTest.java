package Laba2.task4;

public class MovableTest {
    public static void main(String[] args){
        MovablePoint point1=new MovablePoint(0,0,2,2);
        System.out.println(point1.toString());
        point1.moveRight();
        point1.moveUp();
        System.out.println(point1.toString());
        MovableCircle circle=new MovableCircle(0,0,4,4,2);
        System.out.println(circle.toString());
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
        MovableRectangle rectangle=new MovableRectangle(0,0,1,2,2,2);
        System.out.println(rectangle.toString());
        rectangle.moveDown();
        rectangle.moveUp();
        System.out.println(rectangle.toString());
    }
}
