package ATaskWithRashid;

public class CamelCaseRashid {
    // JAVA iS vEry gOOd // -->> javaIsVeryGood

    public static String toCamelCase(String s) {
        String [] word = s.split(" ");
        String a = "";

        for (String each : word) {
            a += each.substring(0,1).toUpperCase()+each.substring(1).toLowerCase();
        }
        String res = a.substring(0,1).toLowerCase()+a.substring(1);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("java iS vERy fun"));
    }
    }