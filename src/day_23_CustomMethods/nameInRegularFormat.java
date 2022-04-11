package day_23_CustomMethods;

public class nameInRegularFormat {
    public static void main(String[] args) {

        nameInRegularFormat("ısMaiL SoNmEZ");


    }

    public static void nameInRegularFormat(String name){

        System.out.println((name.charAt(0)+"").toUpperCase()+name.substring(1,name.indexOf(" ")+1).toLowerCase()+(name.charAt(name.indexOf(" ")+1)+"").toUpperCase()+
            name.substring(name.indexOf(" ")+2).toLowerCase()  );

    }


}
