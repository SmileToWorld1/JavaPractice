package day_45_Abstraction.browserTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("www.google.com");

        chromeDriver.findElement("shoes");

        chromeDriver.findElements("apple, watermelon");

        chromeDriver.getTitle();

        chromeDriver.takeScreenShot();

        chromeDriver.executeScript("go to the cart");

        chromeDriver.close();

        chromeDriver.quit();





    }


}
