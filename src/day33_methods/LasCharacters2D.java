package day33_methods;

public class LasCharacters2D {
    public static void main(String[] args) {
         /*     Given a 2D String array, concatenate the last character of each
          inner element on one line, then each following array values in separate lines
	      {"James", "is", "back"}
	      {"he", "was", "never", "gone"}
          {"methods", "tomorrow"}
          Output:
	      ssk
	      esre
	      sw      */
        String[][] words = {{"James", "is", "back"}, {"he", "was", "never", "gone"}, {"methods", "tomorrow"}};

//        for (int PasswordCheck = 0; PasswordCheck < words.length; PasswordCheck++) {
//            String lastLetter = "";
//            for (int j = 0; j < words[PasswordCheck].length; j++) {
//                lastLetter += words[PasswordCheck][j].charAt(words[PasswordCheck][j].length() - 1);
//            }
//            System.out.println("Last characters: " + lastLetter);
//        }
        for (String [] eachArray: words) {
            for (String  eachWord : eachArray){
                System.out.print(eachWord.charAt(eachWord.length() - 1));
            }
            System.out.println();  // break those lines
        }



















    }
}
