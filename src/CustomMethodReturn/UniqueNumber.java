package CustomMethodReturn;

import my_utilities.StringUtil;

public class UniqueNumber {
    public static void main(String[] args) {
        String str = "aaaaabcccdeeff";
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);



    }
}
