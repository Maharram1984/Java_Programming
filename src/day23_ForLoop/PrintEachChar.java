package day23_ForLoop;

public class PrintEachChar {
    public static void main(String[] args) {

        String s = "Java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println("with loop");

        for(int i = 0; i < s.length(); i++)  {             // AVAC
            System.out.print(s.toUpperCase().charAt(i));
        }
        System.out.println();

        for(int i = s.length() -1; i >= 0; i--) {         // JAVA
            System.out.print(s.toUpperCase().charAt(i));

        }









    }
}
