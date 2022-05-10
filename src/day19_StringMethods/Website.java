package day19_StringMethods;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
         /*
        ask the user to enter a url
        find and print the website from the url
        assume your url always starts with www.
        assume your url always ends with .com
        www.google.com
         --> google */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = input.next();      //www.google.com
                                        //0123<<-->>3210

        String website = url.substring(4,url.length() -4); //www.<<--->>.com

        System.out.println(website);





















    }
}
