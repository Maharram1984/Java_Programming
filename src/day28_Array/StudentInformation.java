package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

//        String[] studentOne = {"007", "James", "Bond", "7" };
//        System.out.println(Arrays.toString(studentOne));//[007, James, Bond, 7]
//
//        String[] studentTwo = new String[4];
//        System.out.println(Arrays.toString(studentTwo));//[null, null, null, null]
//        studentTwo[0] = "010";
//        studentTwo[1] = "John";
//        studentTwo[2] = "Smith";
//        studentTwo[3] = "10";
//        System.out.println(Arrays.toString(studentTwo));//[010, John, Smith, 10]
//
//
//        String[] studentThree = new String[4];
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your ID");                // Enter your ID
//        studentThree[0] = input.nextLine();                 // 011
//        System.out.println("Enter first name");             // Enter first name
//        studentThree[1] = input.nextLine();                 // Maqa
//        System.out.println("Enter last name");              // Enter last name
//        studentThree[2] = input.nextLine();                 // Rafi
//        System.out.println("Enter your batch number");      // Enter your batch number
//        studentThree[3] = input.nextLine();                 // 21
//        System.out.println(Arrays.toString(studentThree));  // [011, Maqa, Rafi, 21]


        String[] studentFour = new String[4];  //{"","","",""};
        String[] questions = {"Enter your ID", "Enter first name",
                "Enter last name", "Enter your batch number" };
        for (int i = 0; i < 4; i++) {        // it is same if u put there PasswordCheck < studentFour.length
            System.out.println(questions[i]);  // reading each element of the question array
            studentFour[i] = input.nextLine(); // assigning the Scanner to studentFour
        }
        System.out.println(Arrays.toString(studentFour));




    }
}
