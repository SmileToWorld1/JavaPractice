package day_11;

public class Browsers {
    public static void main(String[] args) {

        String browserName ="Edge";

        switch (browserName){
            case "chrome": case "firefox": case "safari": case "edge": case "internet explorer":
                System.out.println("Valid Browser");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}
