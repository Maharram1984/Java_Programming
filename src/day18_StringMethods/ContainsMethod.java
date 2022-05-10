package day18_StringMethods;

public class ContainsMethod {
    public static void main(String[] args) {

        String day = "Today it is above 70";   // return to boolean
//
//        System.out.println(day.contains("it is"));   //true
//        System.out.println(day.contains("itis"));    //false
//        System.out.println(day.contains("ay it"));   //true
//        System.out.println(day.contains("7"));       //true
//        System.out.println(day.contains("today"));   //false
//        System.out.println(day.contains("T 7"));     //false


        String str = "     Saturday     ";

        System.out.println(str.startsWith("Saturday")); // false -->> because of empty places
        System.out.println(str);                        // original one)))
        System.out.println(str.length());               // counts all empty places as well)))

        str = str.trim();                               // assigned it now and????
        System.out.println(str.startsWith("Saturday")); // true -->. after assigned
        System.out.println(str);                        //cutting empty places from beginning and end
        System.out.println(str.length());               // it is 8 now after assigned


    }
}
