package day_23_CustomMethods;

public class OddNum1To100 {
    public static void main(String[] args) {

        oddNum1To100();

    }


    public static void oddNum1To100() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}


