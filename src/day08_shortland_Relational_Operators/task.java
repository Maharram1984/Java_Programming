package day08_shortland_Relational_Operators;

import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;

               //-101 * -101 / 100 + 100                                     // 10201???
               //-101 * -100 = 10201 /100 = 102 + 100 = 202
        System.out.println(t);
        System.out.println(p);
//
//        int X = 4;                //4
//        int Y = X * 4 - X++;      // 4 * 4 = 16 - 4 = 12
//                                  //before printing X value is 4
//        System.out.println(X);    //X++ //5
//        System.out.println(Y);    // 12
//                                  //before printing X value is 4
//
//        int a = 5;              //5
//        int b = a + 1;          //6
//        System.out.println(a);
//        System.out.println(b);

//         int a = 8;                  // 7
//         int b = a--;                // 8

//        int M = 300;                             //M = 300
//        int N = 400;                             //N = 400
//        int U = ++M + N++ - M-- % 2 + --N % 2;   //U = 700

        //       M1 + N1  - M1 - N1 = 0
        //       301 + 1  - 1  - 1 = 0 (M = 300 & N = 400)
        //       ( ++M + N++ - M-- + --N = 0 which is 300 +400 = 700)
        //       (2 % - 2 % = 0)

//                                    // 20 - 19 - 20 - 19 - 18
//          int R = 20;               // 20 - 19 - 19 - 19 - 18
//          int W = -R-- + -R++ + --R * R-- % 2;
//             //   -20  + -19  +  19 * 19 = 361 % 2 = 1
//             //          -39  + 1 = -38
//          System.out.println(R);  // 18
//          System.out.println(W);  // -38

//        int A = 50;                        // 54
//        int B = - ++A + A++ + A++ + A++;     // 105
//              //  -51 + 51 +  52 + 53 =   105
//        System.out.println(A);
//        System.out.println(B);

        int e = 1;                               // - 1
        int f = -e-- + e++ / -e-- * --e;        //  - 1
        //      -1   + 0   / -1   *  -1
        //      -1   + 0  * -1
        //      -1   + 0
        //      -1
        System.out.println(e);
        System.out.println(f);

//        int PasswordCheck = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;   //17
//
//        int w = 78 / 2 * 2 + 3 - 5 % 5;   // 81
//
//        int y = ( 2 + 3 ) * 2;  // 10
//
//        int x = 2 + 3 * 2 / 1;  // 8



//        int speedLimit = 55;
//        int currenSpeed = 84;
//        boolean areYouSpeeding = currenSpeed >= speedLimit;
//        System.out.println(" are you speeding? " + areYouSpeeding);



       /*   the gallons to litters
                Ex:
        gallon = 10;
        output:
        10 gallons equal to 37.8541 liters
                gallon = 20
        output:
        20 gallons equal to 75.7082 liters

        */

//        int gallon = 1;
//        double litter = gallon *=3.785;
//
//        System.out.println(gallon + " Gallons oil is equal to: " + litter);
//        System.out.println((gallon*10) + " gallons is equal to " + 10 * (gallon * litter) + " litters ");
//        System.out.println((gallon*20) + " gallons is equal to " + 20 * (gallon * litter) + " litters ");



//        int kq = 1;
//        double pound = kq * 2.205;
//
//        System.out.println(kq + " kq is equal to: " + pound + " pounds ");
//        System.out.println(kq*20 + " kq is equal to: " + 50 * pound + " pounds ");
//
//
//        double KQ = 2.205;
//        double POUND = 10;
//        double tran = KQ*POUND;
//        System.out.println(POUND + " kq is equal " +tran+ "pounds");
//
//        double liter1 = 3.785;
//        double gallon2 = 13;
//        double transfer = liter1*gallon2;
//        System.out.println("This program converts " +gallon2+ " gallons to " + transfer+ " litters ");











    }
}
