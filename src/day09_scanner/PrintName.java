package day09_scanner;

public class PrintName {
    public static void main(String[] args) {
        String name = "James";
        System.out.println("Hello " + name);

        boolean FridayOrNot = false;
        boolean teacher = false;
        boolean police = true;
        boolean firefighter = false;

        boolean getDiscount = FridayOrNot &&
                (teacher || police||  firefighter);
        System.out.println(getDiscount);



    }
}
