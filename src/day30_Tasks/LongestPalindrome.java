package day30_Tasks;

public class LongestPalindrome {
    public static void main(String[] args) {
 /*[IQ] The Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome */

        String [] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        // outer loop is iterating through the array
        for(String eachWord : words){ // eachWord == words[PasswordCheck]
            boolean isPalindrome = true;
            // inner loop is iterating through each String element
            for(int i = 0; i < eachWord.length()/2; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome && eachWord.length() > longestPalindrome.length()){
                longestPalindrome = eachWord;
            }
        }
        System.out.println(longestPalindrome.isEmpty() ? "No Palindrome" : longestPalindrome);
        /*
            if(longestPalindrome.isEmpty()){
                System.out.println("No Palindrome");
             } else {
                System.out.println(longestPalindrome);
              }
         */

    /* civic
        eachWord.charAt(PasswordCheck) != eachWord.charAt(eachWord.length() - 1 - PasswordCheck
        int PasswordCheck = 0
            eachWord.charAt(0) != eachWord.charAt(5 - 1 - 0) --> charAt(4)
                c       !=     c
         PasswordCheck = 1
            eachWord.charAt(1) != eachWord.charAt(5 - 1 - 1) --> charAt(3)
                PasswordCheck       !=     PasswordCheck
                 */
        String [] arr={"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPolindrome="";
        for (int i=0;i< arr.length;i++){
            String word=arr[i];
            String reverse="";
            for(int j=word.length()-1;j>=0;j--){
                reverse+=word.charAt(j);
            }
            if(word.equalsIgnoreCase(reverse)){
                if(longestPolindrome.length()<word.length()){
                    longestPolindrome=word;
                }
            }
        }
        if(!longestPolindrome.isBlank()){/// check if there word inside that variable
            System.out.println(longestPolindrome);
        }else {
            System.out.println("No polindrome");
        }



















    }
}
