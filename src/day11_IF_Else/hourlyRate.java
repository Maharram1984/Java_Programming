package day11_IF_Else;

import java.util.Scanner;

public class hourlyRate {
    public static void main(String[] args) {

      /*  create a double variable for your hourly rate
        create a double variable for the number of hours worked
        calculate your net pay, with consideration of overtime pay
        if you worked more than 40 hours you get overtime pay for the hours
        past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay
        and 3 hours overtime pay)  */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter your hourly rate");
//        double hourlyRate=scan.nextDouble();
//        System.out.println("enter the number of hours worked");
//        double hoursWorked = scan.nextDouble();

        double hourlyRate =20;
        double hoursWorked = 50;
        double overTime, totalPayment ;
        overTime = hoursWorked - 40;
        totalPayment =(hourlyRate * 40) + (hourlyRate * 1.5 * overTime);

        if(hoursWorked <= 40){
            System.out.println("You will get normal 40 hours payment");
        }else {
            System.out.println("You will get normal 40 hours payment and "
                    +overTime+ " hours overtime pay ");
            System.out.println(" Your total payment is: " +totalPayment);
        }















    }
}
