package Day27_NestedLoop;

public class DuplicateCharacters {
    public static void main(String[] args) {
/*[IQ] Duplicate characters
        Given a String, find and print the duplicate characters. A character is
        duplicate if it appears more than once in the String.
         Ex:
	     Input:
		 AAABCCDEEF
	     Output:
		 ACE
	    -> the characters A C and E are found in the String multiple times so they are duplicates  */

        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            if (checked.contains("" + str.charAt(i))) {   //   if (!checked.contains("" + str.charAt(PasswordCheck))) {
                continue;                                // with this but without continue  total of duplicate
            }
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                count++;
                }
            }
            if (count > 1) {      // count >= 1 : count != 1 : as well
                System.out.print(str.charAt(i));
            }
            checked += str.charAt(i);
        }


//
//        String str = "AAABCCDEEF";
//        String checked = "";
//
//        for (int PasswordCheck = 0; PasswordCheck < str.length(); PasswordCheck++) {
//
//            if (!checked.contains("" + str.charAt(PasswordCheck))) {
//
//            }
//            int count = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(PasswordCheck) == str.charAt(j)) {
//                     count++;
//                }
//            }
//            if (count > 1) {      // count >= 1 : count != 1 : as well
//                System.out.print(str.charAt(PasswordCheck));
//            }
//            checked += str.charAt(PasswordCheck);
//        }


    }
}
