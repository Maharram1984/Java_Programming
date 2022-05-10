package day17_String_Class;

public class StringMemory1 {
    public static void main(String[] args) {

        String str1 = ("Java");                     // String literal
        String str2 = ("Java");                     // All of them to String pool
        String str3 = ("Java");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1 == str2 && str2 == str3 && str3 == str1);
        System.out.println("-------------------------------------------------------");
        String s1 = new String("Java");            // new keyword
        String s2 = new String("Java");            // Both are going to heap directly
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println("----------------------------------------");
        String name = "WOODEN SPOON";               //immutable - you can not modify it.
        name = name.toLowerCase();
        name = name.toUpperCase();

        System.out.println(name);


        String a = "Hello";                      // String literal
        String b = "Hello";                      // // All of them to String pool
        String c = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a == b && b == c && c == a);
        System.out.println("__________________________________________");

        String d = new String("World");           // new keyword
        String e = new String("World");
        System.out.println(d.equals(e));
        System.out.println("____________________________________________");

        String name1 = "Wooden Spoon";     //immutable - you can not modify it.
        name1 = name1.toUpperCase();
        name1 = name1.toLowerCase();

        System.out.println(name1);

        String first = "Java";  // String literal, in String pool


        String second = new String("Java");  //String object not in String pool
        //but  directly in the heap
        System.out.println(first == second);

        String third = "Java";               // String literal, to String pool same place
        System.out.println(first==third);
        String forth = "java";              // to String pool but new data because of small - "j"
        System.out.println(first==forth);






    }
}
