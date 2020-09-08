package Laba2.task12;

public class Square extends Rectangle {
    protected double side;
    public Square(){
        super();
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color, boolean filled){
        super(side,side,color,filled);
    }

    public void setWidth(double width) {
        setWidth(side);
    }

    public double getSide() {
        return side;
    }
    @Override
    public String toString(){
        return "Shape: square, side: "+this.width+", color: "+this.color;
    }
}
