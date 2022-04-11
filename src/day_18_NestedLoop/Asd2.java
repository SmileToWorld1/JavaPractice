package day_18_NestedLoop;

public class Asd2 {
    public static void main(String[] args) {

        String str="aaabccdeff";
        String result="";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.indexOf(ch));
                break;
            }
        }


    }
}
