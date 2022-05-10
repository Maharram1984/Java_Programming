package day23_ForLoop;

public class Palindrome {
    public static void main(String[] args) {

        String word = " Wooden";   //reverse the string

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.toUpperCase().charAt(i));
        }

        String str = "Italy";      //reverse the string
        String reverse = "";


        for (int c = str.length() -1; c >= 0; c--){  // System.out.print(str.toUpperCase().charAt(c));
          reverse += str.charAt(c);
        }
       if(str.equals(reverse)){
           System.out.println("Palindrome");
       }else {
           System.out.println("Not Palindrome");
       }

        System.out.println(str.endsWith(reverse) ? "Palindrome" : "Not Palindrome");
    }
}
