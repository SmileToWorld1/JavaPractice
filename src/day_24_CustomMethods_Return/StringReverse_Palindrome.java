package day_24_CustomMethods_Return;

public class StringReverse_Palindrome {
    public static void main(String[] args) {

        String str = "Java-";
        String reverse = reverse(str);
        System.out.println("reverse = " + reverse);

        System.out.println("---------------------------------");
        String str1 = "level";
        boolean palindrome1 = isPalindrome(str);
        boolean palindrome2 = isPalindrome(str1);
        System.out.println("palindrome1 = " + palindrome1);
        System.out.println("palindrome2 = " + palindrome2);

    }
    //3. create a method named reverse that passes one string parameter, the method can return the reversed string
    public static String reverse(String str){

        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    //4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false
    public static boolean isPalindrome(String str){
        String reverse = StringReverse_Palindrome.reverse(str);

        return str.equals(reverse);
    }


}
