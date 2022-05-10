package day18_StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the URL");
        String url = input.next();
        url = url.toLowerCase();
//
//        if(url.startsWith("www") && url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") ||
//                url.endsWith(".net")){
//            System.out.println("It is valid");  //TODO
//        }else {
//            System.out.println("is not valid");
//        }
//
//

        boolean validStart = url.startsWith("www.");
        boolean validEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") ||
                url.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(url + " is a valid website");
        }else {

            if (!validStart) {
                System.out.println(" url needs to start with www.");

            }
            if (!validEnd) {
                System.out.println(" url needs end with .com or .edu or or .gov or .net");
            }


        }
    }
}
