package Laba2.task4;

import Laba2.task4.Movable;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public String toString(){
        return "x="+this.x+" y="+this.y;
    }
    @Override
    public void moveUp() {
        this.y+=ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x-=xSpeed;
    }

    @Override
    public void moveRight() {
        this.x+=xSpeed;
    }
}