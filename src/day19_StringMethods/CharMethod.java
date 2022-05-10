package day19_StringMethods;

public class CharMethod {
    public static void main(String[] args){

        String a = "java";
        System.out.println(a.length());

        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));


        System.out.println(a.indexOf("v"));
        int lastIndex = a.length() -1; // 4 - 1 = 3
        System.out.println(lastIndex);      // 3
        System.out.println(a.charAt(lastIndex));  //a


        System.out.println(a.charAt(a.length() -2));     // v
        int secondLast = a.length() - 2;    // 4 - 2 = 2
        System.out.println(secondLast);                   //2
        System.out.println(a.charAt(secondLast));         //v






























    }
}
