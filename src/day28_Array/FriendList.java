package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        /*Make an array of your friends names asking how many friends do you have,
         then ask for each friend's name one at a time, store all the names into an array */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int size = scan.nextInt();
        String [] friendList = new String [size];

        for (int i = 0; i < friendList.length; i++) {
            System.out.println("Enter your friends name" + (i+1));
            friendList[i] = scan.next();                               //nextLine was issue
        }
        System.out.println(Arrays.toString(friendList));





























    }
}
