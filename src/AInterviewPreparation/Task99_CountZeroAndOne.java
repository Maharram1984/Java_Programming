package AInterviewPreparation;

public class Task99_CountZeroAndOne {

    public static void countZeroAndOne(String str) {
        int zero = 0, one = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
            }
            if (str.charAt(i) == '1') {
                one++;
            }
        }
        System.out.println("Zeros: " + zero);
        System.out.println("Ones: " + one);
    }

    public static void main(String[] args) {
        String str = "abc111def000sjhdjsh0d1sdks000dd11";
        countZeroAndOne(str);
    }
}
