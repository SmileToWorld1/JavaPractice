package day_38_Inheritance_Continue.browserTask;

public class BrowserTest {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        FireFox fireFox = new FireFox();
        Opera opera = new Opera();
        Safari safari = new Safari();

        chromeBrowser.openBrowser();
        chromeBrowser.closeBrowser();
        fireFox.openBrowser();
        fireFox.closeBrowser();
        opera.openBrowser();
        opera.closeBrowser();
        safari.openBrowser();
        safari.closeBrowser();
    }
}
