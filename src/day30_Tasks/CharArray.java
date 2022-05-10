package day30_Tasks;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = { 'j', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(letters)); // [j, a, v, a]

        String word = "java";            // converting a String to a char []
        char [] java = word.toCharArray();
        System.out.println(Arrays.toString(java));    // [j, a, v, a]
        // System.out.println(letters); // String work with char [] internally
        // so the char [] is able to be print as the String
        // print every letter in my String
        for(char eachChar : java){  //  for(char eachChar : word.toCharArray()){  CONVERTED ON LINE-12
            System.out.println(eachChar);   // java
        }
        System.out.println(java[2]);           // v
        System.out.println(java[1]);           // a
        System.out.println(java[2]);           // v
        System.out.println(java[3]);           // a

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};   // convert a char array to a String
        System.out.println(day);                        //monday
//        String [] d = {"abc","adc","afc"};
//        System.out.println(d);                        // error
//        int [] f = {1,2,3,4,5};
//        System.out.println(f);                        // error

        String strDay = new String(day);
        System.out.println(strDay);                 //monday
        System.out.println(strDay.toUpperCase());   //MONDAY
        System.out.println(day);                    //monday
        //System.out.println(day.toUpperCase());// cannot use String methods on a char []


















    }
}
