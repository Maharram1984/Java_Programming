package day10_Scanner;
import java.util.Scanner;
public class Angles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three angle numbers ");
        double angleOne = scanner.nextDouble();
        double angleTwo = scanner.nextDouble();
        double angleThree = scanner.nextDouble();

        double sum = angleOne+angleTwo+angleThree;
        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

//        boolean isTriangle = angleThree+angleOne+angleTwo == 180;
//        boolean isCircle= angleThree+angleOne+angleTwo == 360;
        System.out.println("Is a triangle: " +isTriangle);
        System.out.println("is a circle: " +isCircle);



        Scanner in = new Scanner(System.in);
        System.out.println("What is your age: ");
        byte age = in.nextByte();
        System.out.println("What is your favorite number:");
        long favoriteNumber = in.nextLong();
        System.out.println("What is your favorite book: ");
        in.nextLine();
        String favoriteBook = in.nextLine();
        System.out.println("Your age is: " + age + "\nYour favorite number is: "
        +favoriteNumber+ "\nYour favorite book is: "+favoriteBook);

        //todo




















    }






}
