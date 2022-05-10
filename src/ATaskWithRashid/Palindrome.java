package ATaskWithRashid;

public class Palindrome {
    public static void main(String[] args) {

        String word = "Kamil";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        System.out.println(word.equals(reversed));



        System.out.println(isPalindrome("Anna"));


    }
    public static boolean isPalindrome(String word) {
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equalsIgnoreCase(reversed);
    }
}