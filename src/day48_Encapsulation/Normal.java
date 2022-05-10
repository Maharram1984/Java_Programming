package day48_Encapsulation;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = {4,12,5,25};  // object

        Arrays.sort(a);  // static(I did not make anything)
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);// this variable is static
               // Math is class Pi is variable
        System.out.println(StringUtil.reverse("reverse"));//static
    }
}
