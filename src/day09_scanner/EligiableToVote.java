package day09_scanner;

public class EligiableToVote {
    public static void main(String[] args) {

        String name = "James";
        boolean isCitizen = true;
        boolean hasCriminal = true;
        int age = 38;

        boolean isEligibleToVote =age >= 18 && isCitizen && !hasCriminal ;
        // true && true && (!false) true
        System.out.println(name+ " is eligible to vote: " +isEligibleToVote);

















    }
}
