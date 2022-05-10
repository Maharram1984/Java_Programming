package day4_04_25_2022.packageA;

//diff class same package
//Static variable , methods and block belongs to class,
// instance variables, methods and block belongs to objects

public class Second {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        //System.out.println(obj.d);

        System.out.println(First.e);
    }
}