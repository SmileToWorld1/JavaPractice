package day_38_Inheritance_Continue.shapeTask;

public class Square extends Shape{

    public double size;

    public Square( double size) {
        super("Square");
        this.size =size;
    }

    public String toString(){
        return "Name: "+name+
                ", Size: "+size+
                ", Area: "+area()+
                ", Perimeter: "+perimeter();
    }

}
