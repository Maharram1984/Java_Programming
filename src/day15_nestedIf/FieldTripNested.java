package day15_nestedIf;

import java.util.Scanner;

public class FieldTripNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade level?");
        int gradeLevel = scan.nextInt();
        String location = "", teacherInCharge = "";
        int numberOfGroups = 0;

        boolean notAvailable = true;

        if (gradeLevel >= 1 && gradeLevel <= 6) {

            if (gradeLevel == 1) {
                location = "Apple Orchard";
                numberOfGroups = 3;
                teacherInCharge = "Ms.Smith";

            } else if (gradeLevel == 2) {
                location = "Zoo";
                numberOfGroups = 7;
                teacherInCharge = "Mr.Lee";

            } else if (gradeLevel == 3) {
                location = "Aquarium";
                numberOfGroups = 5;
                teacherInCharge = "Ms.Wilson";

            } else if (gradeLevel == 4) {
                location = "Movie theater";
                numberOfGroups = 2;
                teacherInCharge = "Ms.Reyes";

            } else if (gradeLevel == 5) {
                location = "Museum";
                numberOfGroups = 5;
                teacherInCharge = "Ms.Lela";

            } else if (gradeLevel == 6) {
                location = "Six Flags";
                numberOfGroups = 8;
                teacherInCharge = "Mr.Watt";
            }

            if (notAvailable) {
                String ABCD = "- Grade level - " + gradeLevel + "\n- Location - "
                        + location + "\n- Number of groups - " + numberOfGroups +
                        "\n- Teacher in charge - " + teacherInCharge;
                System.out.println(ABCD);
            }

        } else {
            System.out.println("Grade must be between 1-6 ");
        }


    }
}
