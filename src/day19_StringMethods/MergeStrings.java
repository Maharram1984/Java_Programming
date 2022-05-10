package day19_StringMethods;

public class MergeStrings {

    public static void main(String[] args) {

//        String a = "abc";
//        String b = "XYZ";
//        String merged = "";
//
//        merged += a.charAt(0);
//        merged += b.charAt(0);
//        merged += a.charAt(1);
//        merged += b.charAt(1);
//        merged += a.charAt(2);
//        merged += b.charAt(2);
//        System.out.println(merged.toUpperCase());
//
        String c = "MAHARRAM";
        String d = "natavan!";
        String merged1 = "";

        merged1 += d.charAt(0);
        merged1 += c.charAt(1);
        merged1 += d.charAt(2);
        merged1 += c.charAt(3);
        merged1 += c.charAt(0);
        merged1 += d.charAt(1);
        merged1 += c.charAt(7);
        merged1 += d.charAt(7);
        System.out.println(merged1.toLowerCase());


        String a = "Natavan";
        String merged = "";

        merged += a.charAt(6);
        merged += a.charAt(5);
        merged += a.charAt(4);
        merged += a.charAt(3);
        merged += a.charAt(2);
        merged += a.charAt(1);
        merged += a.charAt(0);

        System.out.println(merged.toUpperCase());
    }




}
