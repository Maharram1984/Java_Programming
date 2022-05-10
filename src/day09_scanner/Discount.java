package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isItWeekend =true;
        boolean areYouAPoliceOfficer= false;
        boolean areYouFirefighter = false;
        boolean areYouTeacher = true;

        boolean doYouGetDiscount = isItWeekend &&
                ( areYouTeacher || areYouAPoliceOfficer || areYouFirefighter);

        System.out.println(doYouGetDiscount);










    }
}
