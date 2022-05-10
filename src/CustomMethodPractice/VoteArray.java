package CustomMethodPractice;

public class VoteArray {
 /*    create a method that will accept an age and determine if the person is
       eligible to vote. Person must be 18 years or older to vote     */

    public static void Vote(int age) {
        if (age >= 18) {
            System.out.println("You have " +age+ " years old and you are eligible to vote");
        } else {
            System.out.println("You have " +age+ " years old and you are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Vote(35);
        Vote(17);

    }

}
