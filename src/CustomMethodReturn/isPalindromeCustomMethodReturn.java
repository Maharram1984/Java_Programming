package CustomMethodReturn;

public class isPalindromeCustomMethodReturn {
    public static void main(String[] args) {

//        String str2 = reverse("Wooden Spoon");
//        System.out.println(str2);
        System.out.println(reverse("wooden Spoon"));

        System.out.println(isPalindrome("Anna"));
    }

    public static String reverse(String str){

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
        
    }

    public static boolean isPalindrome(String str){

        String reversed = reverse(str);

        return reversed.equalsIgnoreCase(str);
    }

}