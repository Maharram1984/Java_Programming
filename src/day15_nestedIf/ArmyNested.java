package day15_nestedIf;
import java.util.Scanner;

public class ArmyNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen = input.nextBoolean();
        System.out.println("Are you a resident?");
        boolean isResident = input.nextBoolean();
        System.out.println("Do you have High School Diploma?");
        boolean hasDiploma = input.nextBoolean();
        System.out.println("How old are you? ");
        int age = input.nextInt();


        if ((isCitizen || isResident) && hasDiploma && (age >= 18 && age <= 35)) {
            System.out.println("You are qualified for the army ");
        } else {

            if (!isCitizen && !isResident) {   // !(isCitizen || isResident)  <> isCitizen != true
                System.out.println("You must be a citizen or a resident");
            }
            if (!hasDiploma) {
                System.out.println("You must have a high school diploma ");
            }
            if (age < 18 || age > 35) {           // !(age >= 18 && age <= 35)
                System.out.println("Your age most be between 18 to 35 years old");

            }


        }


    }
}



