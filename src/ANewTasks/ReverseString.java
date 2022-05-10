package ANewTasks;

import java.util.ArrayList;

public class ReverseString {

    public static void main(String[] args) {

        int n=5;   // factorial number
        int result1 = 1;
        for(int i = 1; i <= n; i++){
            result1 = result1 * i;
        }
        System.out.println(result1);

        String[] str1 = {"Java is very fun with Rashid"};
        String reverse = "";
        for (int i = str1.length- 1; i >= 0; i--) {
            String str2 = "";
            for (int j = str1[i].length() - 1; j >= 0; j--) {
                str2 += str1[i].charAt(j);
            }
            reverse +=str2+" ";
        }
        System.out.println(reverse);

        String[] str3 = "Java is very fun with Rashid".split(" ");
        for (String each : str3) {
            String reverse1 = "";
            for (int j = each.length() - 1; j >= 0; j--) {
                reverse1 += each.charAt(j);
            }
            System.out.print(reverse1+ " ");
        }

        System.out.println();

        String aa = "Java is very fun with Rashid";
        for (int i = aa.length() - 1; i >= 0; i--) {
            System.out.print(aa.charAt(i));
        }

        System.out.println();

        String[] str = "Java is very fun with Rashid".split(" ");
        str[5]="Maqa";
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }









    }
}
