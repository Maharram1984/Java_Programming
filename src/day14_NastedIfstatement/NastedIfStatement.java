package day14_NastedIfstatement;

public class NastedIfStatement {
    public static void main(String[] args) {

        int score = 101;

        if(score >= 50 && score <= 100) {              // IF THE SCORE IS VALID

            if (score >= 70) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid number");     // IF THE SCORE IS NOT VALID
        }



























    }
}
