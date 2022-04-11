package day_10;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 55;
        String ageGroup = "";

        if (age>=0 && age<=150){
            if (age<21){
                ageGroup = "Teenager";
            }else if (age<55){
                ageGroup = "Adult";
            }else {
                ageGroup = "Senior";
            }
        }else {
            ageGroup = "Invalid";
        }

        System.out.println(ageGroup);
    }
}
