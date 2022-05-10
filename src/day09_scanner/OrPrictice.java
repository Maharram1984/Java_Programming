package day09_scanner;

public class OrPrictice {
    public static void main(String[] args) {

//        int apples = 5;
//        int oranges = 10;
//
//        System.out.println(apples > 1 || oranges < 5);      // true/false   OR -->> TRUE
//        System.out.println(apples > 10 || oranges == 10);   // false/true   OR -->> TRUE
//
//        System.out.println(apples > 10 && oranges == 10);   // false/true  AND -->> FALSE
//        System.out.println(apples < 10 && oranges > 5);     // true/true   AND -->> TRUE

       // System.out.println(5/0);   WRONG

        System.out.println(true || 5/0 == 0);
       // System.out.println(true | 5/0 == 0);   ERROR

        System.out.println(false && 5/0 == 0);


        int a = 0;
        System.out.println(false && a++ == 5);
        System.out.println(a);

        int b = 0;
        System.out.println(false & b++ == 5);
        System.out.println(b);










    }







}
