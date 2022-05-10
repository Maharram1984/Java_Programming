package day11_IF_Else;

import java.util.Scanner;

public class salesAmount {
    public static void main(String[] args) {

       /* create a sales amount variable
        use the sales amount to determine the bonus you get at end of the month
        if your sales amount is less than 10000 you don't get any bonus
        if your sales amount is more than or equal to 10000 and less than
        15000 you get a bonus of 5000
        if your sales amount is more than or equal to 15000 you get a bonus
        of 7000
        print your bonus number        */
        Scanner input =new Scanner(System.in);
        int salesAmount = input.nextInt();

      //  int salesAmount = 5000;
        int bonus1 = 5000;
        int bonus2 = 7000;
        if(salesAmount <10000){
            System.out.println("You do not have any bonus. Total: $" +salesAmount);
        }else if(salesAmount >= 10000 && salesAmount < 15000){
            System.out.println("You will get extra $" +bonus1+ " bonus.");
        }else if(salesAmount >= 15000){
            System.out.println("You will get extra $" +bonus2+ " bonus.");
        }





















    }
}
