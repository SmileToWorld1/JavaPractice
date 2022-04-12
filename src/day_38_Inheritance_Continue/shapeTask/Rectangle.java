package day_38_Inheritance_Continue.shapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }

    public String toString(){
        return "Name: "+name+
                ", Length: "+length+
                ", Width: "+width+
                ", Area: "+area()+
                ", Perimeter: "+perimeter();
    }

}
