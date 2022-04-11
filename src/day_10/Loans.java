package day_10;

public class Loans {
    public static void main(String[] args) {

        int salary = 75_000;
        int creditScore = 450;

        System.out.println((salary > 60_000 && creditScore > 650)? "Loan Approved" : "Loan Denied");

    }
}
