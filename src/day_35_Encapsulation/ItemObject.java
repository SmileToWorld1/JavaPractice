package day_35_Encapsulation;

public class ItemObject {
    public static void main(String[] args) {
         Item item1 = new Item("Apple",10,1);
        Item item2 = new Item("1Apple",10,1);
        Item item3 = new Item("A pple",10,1);
        Item item4 = new Item("App$le",10,1);
        Item item5 = new Item("toilet paper",10,1);
        Item item6 = new Item("toilet Paper",10,5);
        Item item7 = new Item("",-10,-1);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        System.out.println(item4);
        System.out.println(item5);
        System.out.println(item6);
        System.out.println(item7);




    }
}
