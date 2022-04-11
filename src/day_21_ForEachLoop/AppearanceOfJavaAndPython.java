package day_21_ForEachLoop;

import java.util.Arrays;

public class AppearanceOfJavaAndPython {
    public static void main(String[] args) {

        String sentence = "JavaNN is cool, pythonNN is also cool. Python and java " +
                "are popular computer languages, maybe java much more :)";
        String[] str = sentence.split(" ");
        int java=0, python = 0;

        for (String each : str) {
            if (each.toLowerCase().contains("java")){
                java++;
            }else if(each.toLowerCase().contains("python")){
                python++;
            }
        }
        System.out.println("Java is: "+java+", Python is: "+python);
    }
}
