package day_36_Inheritance.sportsTask;

public class Sport {

    public String name,rules;
    public int numberOfPlayers, numberOfReferee;

    public void setInfo(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        this.name = name;
        this.rules = rules;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
    }
    public void play(){
        System.out.println("People play a "+name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
