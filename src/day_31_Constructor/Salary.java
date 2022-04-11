package day_31_Constructor;

public class Salary {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate*weeklyHours*52;
    }
    public double stateTax(){
        return salary()*stateTaxRate;
    }
    public double federalTax(){
        return salary()*federalTaxRate;
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salaryBeforeTax=" + salary() +
                "stateTax=" + stateTax() +
                "federalTax=" + federalTax() +
                "salaryAfterTax=" + salaryAfterTax() +
                '}';
    }

}
