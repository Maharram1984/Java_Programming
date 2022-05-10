package TASK;

public class classPizza {

    public static void main(String[] args) {

         String typeOfPizza = " Cheese pizza ";
         int numberOfSlices = 16;
         int numberOfPeopleEating = 5;
         int eachPersonAte = numberOfSlices / numberOfPeopleEating;
         int leftOver = numberOfSlices % numberOfPeopleEating;
        System.out.println(eachPersonAte);
        System.out.println(leftOver);

        System.out.println("We got " + typeOfPizza + " with " + numberOfSlices +
        " slices and " + numberOfPeopleEating + " people ate " + eachPersonAte +
        " slices for each and " + leftOver + " slices left over ");









            }




}
