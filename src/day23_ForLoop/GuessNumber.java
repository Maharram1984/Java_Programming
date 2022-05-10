package day23_ForLoop;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 80;
        int guess;

        do{
            System.out.println("Guess a number from 1-100");
            guess = input.nextInt();

            if(guess > secretNumber){
                System.out.println(guess + " is too high");
            }else if (guess < secretNumber){
                System.out.println(guess + " is too low");
            }
        } while (guess != secretNumber);  // that is false that is why loop stopped
                 System.out.println("You guessed correct");






































    }
}
