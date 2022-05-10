package day19_StringMethods;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "Sunday";
        //            012345
        System.out.println(str.substring(1));
        System.out.println(str.substring(3));           //day
        System.out.println("Satur" + str.substring(3)); // Saturday

        System.out.println(str.substring(0, 6)); //0 -starts == 6 - stops
        System.out.println("H"+str.substring(1,5) + "PasswordCheck");
























    }
}
