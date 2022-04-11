package day_36_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner productOwner = new ProductOwner();
        productOwner.setInfo(123,"PO",1450000,"Ali",25,'M');
        ScrumMaster scrumMaster = new ScrumMaster();
        scrumMaster.setInfo(124,"SM",175000,"Mehmet",29,'M');
        BusinessAnalyst businessAnalyst = new BusinessAnalyst();
        businessAnalyst.setInfo(125,"BA",170000,"Mustafa",35,'M');
        Tester tester1 = new Tester();
        tester1.setInfo(126,"SDET",130000,"Alya",28,'F');
        Tester tester2 = new Tester();
        tester2.setInfo(127,"QA",145000,"Fulya",29,'F');
        Tester tester3 = new Tester();
        tester3.setInfo(128,"Tester",150000,"Mert",32,'M');
        Tester tester4 = new Tester();
        tester4.setInfo(130,"SDET",150000,"İsmail",28,'M');
        Developer developer1 = new Developer();
        developer1.setInfo(140,"Developer",175000,"Salih",35,'M');
        Developer developer2 = new Developer();
        developer2.setInfo(141,"Full Stack Dev.",200000,"Asya",30,'F');
        Developer developer3 = new Developer();
        developer3.setInfo(143,"Front-End Dev.",195000,"Melisa",24,'F');
        Developer developer4 = new Developer();
        developer4.setInfo(144,"Back-End Dev.",200000,"Fatih",27,'M');
        Developer developer5 = new Developer();
        developer5.setInfo(145,"Full Stack Dev.", 200000,"Necip",30,'M');

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4));
        ArrayList<Developer>developers=new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

        Tester[] testers1 = {tester1,tester2,tester3,tester4};
        Developer[] developers1 = {developer1,developer2,developer3,developer4,developer5};


        ScrumTeam scrumTeam = new ScrumTeam(productOwner,businessAnalyst,scrumMaster);

        scrumTeam.testers = testers;
        scrumTeam.developers = developers;

        scrumTeam.addTester(testers1);
        scrumTeam.addDeveloper(developers1);

        System.out.println(scrumTeam);






    }
}
