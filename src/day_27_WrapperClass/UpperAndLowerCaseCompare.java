package day_27_WrapperClass;

public class UpperAndLowerCaseCompare {

    public static void main(String[] args) {

      String  str = "JAVA java";

        System.out.println(upperAndLowerLetComp(str));

    }

    public static boolean upperAndLowerLetComp(String str){

        int lower = 0, upper = 0;
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)){
                upper ++;
            }else if (Character.isLowerCase(each)){
                lower ++;
            }
        }
        return lower==upper;
    }



}
