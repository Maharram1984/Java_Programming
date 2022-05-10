package AInterviewPreparation;

public class Task6_CountLetters {

    /*  String h="AAABBBCCC";
        String result = "";
        output ABC */

    public static String countLetter(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i) + "";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(countLetter(str));
    }
}

/*   if (result.contains("" + str.charAt(i))) {
                continue;
            }
            result += str.charAt(i) + ""; */
