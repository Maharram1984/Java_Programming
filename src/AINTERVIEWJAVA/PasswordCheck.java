package AINTERVIEWJAVA;

public class PasswordCheck {
    /* Create password - the length less than 12, more than 6, first character is number */
    public static void main(String[] args) {
        String str = "84Maha123";

    System.out.println(password(str));

}

    public static boolean password(String str){
        return str.length() > 3 && str.length() < 12 && Character.isDigit(str.charAt(0));
    }
}
