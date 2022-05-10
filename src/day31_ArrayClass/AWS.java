package day31_ArrayClass;

import java.util.Scanner;

public class AWS {
    public static void main(String[] args) {

        // Creat an app and we want to deploy on multiple zones

        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String[] allZones = zones.split(",");

        for (String eachZone : allZones) {
            System.out.println(app + " is deploying on " + eachZone);
        }

//        for (int PasswordCheck = 0; PasswordCheck < allZones.length; PasswordCheck++) {
//            System.out.println(app + " is deploying on " + allZones[PasswordCheck]);
//        }




        String a = "Java";
        String b = "Monday,Tuesday,Wednesday,Saturday,Sunday";
        String[] abc = b.split(",");

        for (int i = 0; i < abc.length; i++) {
            System.out.println(a + " always on " + abc[i]);
        }
//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //TYPE YOUR CODE BELOW:
//        boolean result = false;
//
//        for(int PasswordCheck = 0; PasswordCheck < nums.length -1; PasswordCheck++){
//            if(nums[PasswordCheck] == 5 && nums[PasswordCheck+1] == 5){
//                result = true;
//                //break;
//            }
//        }
        // System.out.println(result);

 //       Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();                // int[] size = {1,2,5,5,4,0,9,8};
//        int[] nums = {1, 2, 5, 5, 4, 0, 9, 8};
//        for (int PasswordCheck = 0; PasswordCheck < nums.length; PasswordCheck++) {
//            //  nums[PasswordCheck] = scan.nextInt();
//        }
//
//        //WRITE YOUR CODE BELOW
//        System.out.println("Second element: " + nums[1]);
//        System.out.println("Second to last element: " + nums[nums.length - 2]);


//        int inhabitants = scan.nextInt();
//        int day = 0;
//        while (inhabitants >= 1){
//            System.out.println("Day" +day+"=="+inhabitants);
//            inhabitants = inhabitants/2;
//        }

    }
}