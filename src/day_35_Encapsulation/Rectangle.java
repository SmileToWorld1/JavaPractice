package day_35_Encapsulation;

public class Rectangle {

    private double width, length;

    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }
    public double getWidth(){
        return width;
    }
    public double getLength() {
        return length;
    }

    public double calcArea(){
        return getLength()*getWidth();
    }
    public double calcPerimeter(){
        return 2*(getWidth()+getLength());
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", calcArea=" + calcArea() +
                ", calcPerimeter=" + calcPerimeter() +
                '}';
    }
}
