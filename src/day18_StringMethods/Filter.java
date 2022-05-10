package day18_StringMethods;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your message:");
        String msg = scan.nextLine();
        msg = msg.toLowerCase();               // input.nextline().trim().toLowerCase//TODO
        msg = msg.trim();

        if(msg.contains("java is bad") || msg.contains("quit")
                || msg.contains("have fun") || msg.contains("crying")){
            System.out.println(" Message failed to send");
        }else {
            System.out.println(msg + " was sent");
        }





    }
}
