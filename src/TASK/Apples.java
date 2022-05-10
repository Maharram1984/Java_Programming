package TASK;

public class Apples {
    public static void main(String[] args) {

        String typeOfApple = " red apples";
        int numberOfApple = 20;
        int numberOfPeople = 6;
        int appleForEachPerson = numberOfApple / numberOfPeople;
        int leftOverAfter = (numberOfApple % numberOfPeople);

        System.out.println("I bought " + numberOfApple + " " + typeOfApple +
        " from \"Costco\" and we are\n"+ numberOfPeople + " person at home. " +
        "So, Each of us ate " + appleForEachPerson + " apples.\n" + leftOverAfter +
        " apples left over ");




















    }
}
