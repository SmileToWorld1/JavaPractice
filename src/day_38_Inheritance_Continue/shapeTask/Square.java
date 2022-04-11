package day_38_Inheritance_Continue.shapeTask;

public class Square extends Shape{

    public double size;

    public Square(String name, double size) {
        super(name);
        this.size =size;
    }

    public String toString(){
        return "Name: "+name+
                "Size: "+size+
                "Area: "+area()+
                "Perimeter: "+perimeter();
    }

}
