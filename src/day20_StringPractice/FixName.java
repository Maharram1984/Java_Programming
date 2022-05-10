package day20_StringPractice;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();//.trim().toLowerCase();               //      jaMES
        System.out.println("enter your last name");
        String lastName = input.next();//.trim().toLowerCase();                //     bonD

        firstName = firstName.trim().toLowerCase();    //james (assigned it to trim and gave lowercase)
        lastName = lastName.trim().toLowerCase();      //bond  (assigned it to trim and gave lowercase)

        String fixedFirst = firstName.substring(0, 1).toUpperCase(); //J
        fixedFirst += firstName.substring(1);                //J +ames

        String fixedLast = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(fixedFirst + " " + fixedLast);   // James Bond


//        String fixedFirst = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
//        String fixedLast = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
//
//        System.out.println(fixedFirst + " "+ fixedLast);




    }
}
