package day22_loops;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        boolean keepTalking = true;

          while (keepTalking) {

              System.out.println("Enter a message");
              String msg = input.nextLine();

              switch (msg) {
                  case "hello":
                      System.out.println("hi");
                      break;
                  case "how are you":
                      System.out.println("good");
                      break;
                  case "bye":
                      System.out.println("No, do not leave");
                      keepTalking = false;
                  default:
                      System.out.println("I do not know what you said");


              }
          }








































    }
}
