package day18_StringMethods;

public class RecapMethods {
    public static void main(String[] args) {

        String s = "pen";  // "s" is -->> String literal it is in the String Pool
        String s2 = new String("pen");  // new keyword
        System.out.println("Compare with == " +(s==s2));  //false
        System.out.println("Compare with .equals() " +s.equals(s2)); // true bec.checking just value

        System.out.println(s.equals("Pen"));     //false bec.of "P"-->> care  about sensitivity
        System.out.println(s.equalsIgnoreCase("Pen")); //true -->>does not care about case sensitivity

        boolean isSame = s.equalsIgnoreCase("PEN"); //it is same does not care case sensitivity

        if(s.length() >= 4){
            System.out.println("Long word");
        }else {
            System.out.println("short word"); // pen is 3 letters
        }

        System.out.println("aaaaa".length());  //5  example
        System.out.println("aa  aa".length()); //6  example













    }
}
