package day_10;

public class BiggerNumber {
    public static void main(String[] args) {
        int n1 = 23;
        int n2 = 14;
        int n3 = 14;

        System.out.println((n1!=n2 && n2!=n3)? (n1>n2 && n1>n3)? n1+" is bigger"
                :(n2>n1 && n2>n3)? n2+" is bigger" : n3+" is bigger" : "Invalid numbers");

    }
}
