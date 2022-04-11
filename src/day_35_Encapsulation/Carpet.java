package day_35_Encapsulation;

public class Carpet {

    private double width, length, unitPrice;
    private boolean isPersian;

    public void setWidth(double width){
        if (width<=0){
            return;
        }
        this.width = width;
    }
    public void setLength(double length){
        if (length<=0){
            return;
        }
        this.length = length;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice<=0){
            return;
        }
        this.unitPrice = unitPrice;
    }
    public void setPersian(boolean isPersian) {
        this.isPersian = isPersian;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        this.isPersian = isPersian;
    }
    public double calcCost(){
       double totalPrice = (width*length)*unitPrice;
       if (isPersian){
           totalPrice += 200;
       }
       return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", calcCost=" + calcCost() +
                '}';
    }
}
