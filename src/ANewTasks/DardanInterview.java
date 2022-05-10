package ANewTasks;

import java.util.Arrays;

public class DardanInterview {
    /* don't use divide operator
          int a=11;
          int b=2;
       divide a by b and result is =5
       reminder =1  */
    public static void main(String[] args) {
        int a = 11;
        int b = 2;
        int count = 0;
        for (int i = a; i >= b; i -= b) {  // while(a >= b)
            count++;
            a -= b;
        }
        System.out.println("divided: " + count);
        System.out.println("reminder: " + a);


        String evenNum = "";
        String oddNum = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNum += i + " ";
            } else {
                oddNum += i + " ";
            }
        }
        System.out.println(evenNum);
        System.out.println(oddNum);

        int num = 6;
        String str = (num % 2 == 0) ? "even" : "odd";
        System.out.println(str);


        String result = "";
        for (int i = 1; i <= 100; i++) {
            result += (i % 5 == 0 && i % 3 == 0) ? "FizzBuzz ," : (i % 5 == 0) ? "Buzz ,"
                    : (i % 3 == 0) ? "Fizz ," : i + ", ";
        }
        System.out.println(result);

       int[]aa = {1,2,3,4};
       int[]bb = {5,6,7,8,9,10};
       int cnt = 0;
       int[]arr = Arrays.copyOf(aa,aa.length+bb.length);
        for (int i =aa.length; i < arr.length; i++) {
            arr[i] = bb[cnt++];
        }
        System.out.println(Arrays.toString(arr));
    }
}