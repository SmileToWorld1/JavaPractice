package day_20_Arrays;

import java.util.Arrays;

public class PracticeTasks3 {
    public static void main(String[] args) {

        String[] items = { "Shoes","Jacket","Gloves", "AirPods", "iPad",
                        "iPhone 12 case"};
        double[] prices = { 99.99, 150.0, 9.99, 250.0, 439.5, 39.99 };
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));//[Shoes, Jacket, Gloves, AirPods, iPad, iPhone 12 case]
        int glovesFirstIndex = Arrays.toString(items).indexOf("G");
        System.out.println("Fist index number of gloves is: "+ glovesFirstIndex);

        boolean isTrue = Arrays.toString(items).contains("iPad");
        System.out.println("Items contain the iPad: "+isTrue);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #"+ itemIDs[i]);
        }
    }
}
