package day_10;

public class Grade {
    public static void main(String[] args) {

        char grade= 'H';
        String result= "";

        if (grade>='A' && grade<= 'F'){

            if (grade == 'A'){
                result = "Excellent";
            }else if (grade == 'B'){
                result = "Great job";
            }else if (grade == 'C'){
                result = "Good";
            }else if (grade == 'D'){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{
            result = "Invalid";
        }
        System.out.println("'" + grade + "'" + ": " + result);

    }
}
