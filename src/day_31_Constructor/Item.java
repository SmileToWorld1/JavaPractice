package day_31_Constructor;

public class Item {

    public String name;
    public double unitPrice, quantity;

    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        double totalPrice = unitPrice*quantity;
        return totalPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total price= $" + calcCost() +
                '}';
    }
}
