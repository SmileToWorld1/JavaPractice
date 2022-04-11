package day_35_Encapsulation;

public class Item {

    private String name ;
    private double unitPrice, quantity;

    public void setName(String name){
        char [] arr = name.toCharArray();

        if (name.isEmpty()||name.isBlank()){
            return;
        }
        for (char each : arr) {
            if (each == ' '){
                continue;
            }else if (!(Character.isLetterOrDigit(each))){
                return;
            }
        }
        if (!(Character.isLetter(arr[0]))){
            return;
        }
        this.name = name;
    }
    public void setUnitPrice(double unitPrice){
        if (unitPrice<=0){
            return;
        }
        this.unitPrice = unitPrice;
    }
    public void setQuantity(double quantity){
        if (quantity<=0){
            return;
        }
        if (!(name==null)&&name.equalsIgnoreCase("toilet paper")&&quantity>1){
            return;
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, double quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double calcCost(){
        return getUnitPrice()*getQuantity();
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", calcCost=" + calcCost() +
                '}';
    }
}


