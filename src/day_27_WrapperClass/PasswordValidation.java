package day_27_WrapperClass;

public class PasswordValidation {

    public static void main(String[] args) {
        String str = "Lcsddssa";
        passwordValidation(str);
    }

    public static void passwordValidation(String str){
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialChar = false;
        boolean isDigit = false;

        for(char each : str.toCharArray()){
           if (Character.isUpperCase(each)){
               isUpperCase = true;
           }else if (Character.isLowerCase(each)){
               isLowerCase = true;
           }else if (Character.isDigit(each)){
               isDigit = true;
           }else{
               isSpecialChar = true;
           }
        }

        if (str.toCharArray().length<8||str.contains(" ")){
            System.err.println("Your Password MUST be at least have 8 characters long, and should not contain space");
            System.err.println("Your password is not a strong password.");
            System.exit(0);
        }else if ( !isUpperCase ){
            System.err.println("PassWord should at least contain one upper case letter");
            System.err.println("Your password is not a strong password.");
            System.exit(0);
        }else if ( !isLowerCase ){
            System.err.println("PassWord should at least contain one lower case letter");
            System.err.println("Your password is not a strong password.");
            System.exit(0);
        }else if ( !isSpecialChar ){
            System.err.println("PassWord should at least contain one special characters");
            System.err.println("Your password is not a strong password.");
            System.exit(0);
        }else if ( !isDigit ){
            System.err.println("PassWord should at least contain a digit");
            System.err.println("Your password is not a strong password.");
            System.exit(0);
        }else{
            System.out.println("Your password is a strong password");
        }
    }

}
