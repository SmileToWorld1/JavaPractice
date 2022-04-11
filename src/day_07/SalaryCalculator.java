package day_07;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double federalTax = salaryBeforeTax*federalTaxRate;
        double stateTax = salaryBeforeTax*stateTaxRate;
        double totalTax = federalTax + stateTax;
        double netIncomes = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax );
        System.out.println("Federal tax is: $" + (int)federalTax);
        System.out.println("State tax is: $" + (int)stateTax);
        System.out.println("Total tax is: $"+(int)totalTax);
        System.out.println("Net income is: "+ (int)netIncomes);

/*
 Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */

        }


    }
