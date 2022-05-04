package day_45_Abstraction.browserTask;

public interface WebDriver extends SearchContext{

    void get(String URL);
    void close();
    void quit();
    void getTitle();


}
