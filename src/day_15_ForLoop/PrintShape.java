package day_15_ForLoop;

public class PrintShape {
    public static void main(String[] args) {
        String a= "";

        for (int i = 0; i < 6; i++) {
           a +="*";
        }
        for (int i = 0; i < 7; i++) {

            System.out.println(a);
        }
    }
}
