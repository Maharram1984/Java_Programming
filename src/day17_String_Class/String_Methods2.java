package day17_String_Class;

public class String_Methods2 {
    public static void main(String[] args) {

        String met8 = "james";

        System.out.println(met8.equals("james"));             // true
        System.out.println(met8.equals("James"));             // false
        System.out.println(met8.equalsIgnoreCase("James"));   // true
        System.out.println("---------------------------------------------");
        String met9 = "Monkey";
        System.out.println(met9.equals("monkey"));
        System.out.println(met9.equals("Monkey"));
        System.out.println(met9.equalsIgnoreCase("MONKEY"));  // it checks letter to letter
        System.out.println("---------------------------------------------");

        System.out.println("cat".equals("dog"));

        String a = new String("hello");   // it always checks value and characters
        String b = new String("hello");           // new keyword
        System.out.println(a.equals(b));
        System.out.println(a.equals("hello"));

        String e = new String("World");
        String d = new String("World");
        System.out.println(d.equals(e));   //true
        System.out.println(d==e);          //false
        d = e = "World";
        System.out.println(d==e);          // true


        String a1 = new String("Hello");
        String b1 = new String("Hello");
        System.out.println(a1==b1);
        a1 = b1 = ("Hello");
        System.out.println(a1==b1);  //there are separate objects, but value the same


        System.out.println("Cybertek20"+2+1);  // todo



































    }
}
