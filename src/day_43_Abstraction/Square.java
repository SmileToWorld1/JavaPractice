package day_43_Abstraction;

public final class Square extends Shape{

    private double size;

    public Square( double size) {
        super("Square");
        setSize(size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size<=0){
            throw new RuntimeException("Invalid Size: "+size);
        }
        this.size = size;
    }

    public double area() {
        return  size*size;
    }

    public double perimeter() {
        return 4*size;
    }

    public double hypotenuse(){
        return size*Math.sqrt(2);
    }

    public String toString() {
        return "Square{" +
                "size=" + size +
                ", Area: "+area()+
                ", Perimeter: "+perimeter()+
                ", Hypotenuse: "+hypotenuse()+
                '}';
    }
}
