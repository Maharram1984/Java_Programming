package day35_ReturnMethod;

public class FixFormat {

    public static String fixFormat(String str) {
        str = str.trim();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

    }

    public static void main(String[] args) {
        System.out.println(fixFormat("JAMES"));
    }


}
