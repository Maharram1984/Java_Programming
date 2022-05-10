package my_utilities;

public class StringUtil {

    /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String fixFormat(String str) {
 /* Fix Format
    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase */

        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }


    public static int frequencyOfCharacter(String str, char letter) {
 /* Frequency of Character
    create a method that will accept a word(String) and a letter (char) and return
    how many times that given letter is found in the given word */
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static String uniqueCharacter(String str) {
        /* Unique Characters create a method that will accept a word(String)
           and return a String with all the unique characters. A character is
           unique if it only appears in the String once.
           Hint: use your frequency method to do some of the work
           Ex:
           Input:
           aaaaabcccdeeff
           Output:
             bd   */
            String unique = "";
            for (int i = 0; i < str.length(); i++) {
                int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
                if (count == 1) {
                    unique += str.charAt(i);
                }
            }
            return unique;
        }






}