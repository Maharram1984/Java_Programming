package TASK;

public class SalaryCalculator {
    public static void main(String[] args) {

     int salary = 100000;
     double stateTaxRate = 0.08;                  // 8 %
     double federalTaxRate = 0.21;                // 21 %
     double stateTax = salary*stateTaxRate;
     double federalTax = salary*federalTaxRate;
     double totalTax = stateTax + federalTax;
     double salaryAfterTax = salary - totalTax;

        System.out.println("* Salary:\t\t\t\t " + salary);
        System.out.println("* State Tax Rate:\t\t " + stateTaxRate);
        System.out.println("* Federal Tax Rate:\t\t " + federalTaxRate);
        System.out.println("* Total State Tax:\t\t " + stateTax);
        System.out.println("* Total Federal Tax: \t " + federalTax);
        System.out.println("* Total Tax:\t\t\t " + totalTax);
        System.out.println("_________________________________________");
        System.out.println("* Total Salary:\t\t\t " + salaryAfterTax);
















     }



}
