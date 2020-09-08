package Laba2.task4;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed,int ySpeed,int radius){
        center=new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius=radius;
    }
    @Override
    public void moveUp() {
    center.moveUp();
    }

    @Override
    public void moveDown() {
    center.moveDown();
    }

    @Override
    public void moveLeft() {
    center.moveLeft();
    }

    @Override
    public void moveRight() {
    center.moveRight();
    }
    @Override
    public String toString(){
        return "radius="+this.radius+" center: "+this.center;
    }
}