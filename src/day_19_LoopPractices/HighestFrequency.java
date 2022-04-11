package day_19_LoopPractices;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aabbbcccccddddddddd";
        String result = "";

        int countBefore = 0;

        for (int i = 0; i < str.length(); i++) {
            int count= 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                  count++;
                }
            }
            if (count>countBefore) {
                result = ""+str.charAt(i);
                countBefore = count;
            }

        }
        System.out.println("Highest frequency is: "+result+
                "\nFrequency is: "+countBefore);
    }
}
