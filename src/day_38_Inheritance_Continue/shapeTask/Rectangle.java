package day_38_Inheritance_Continue.shapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public String toString(){
        return "Name: "+name+
                "Length: "+length+
                "Width: "+width+
                "Area: "+area()+
                "Perimeter: "+perimeter();
    }

}
