package day04_Tasks;

//import java.awt.*;
import java.util.Scanner;

public class Carpet {
    public static void main(String[] args) {
        /*Task : CarpetShop
                - Ask the user which room do they need carpet? (String)
                List of Rooms
                Bedroom
                Kitchen
                -> If the user gives other than these roomTypes ,
                 give an error message about "Invalid Room Type"
                - Ask the user roomType dimensions (as meter and double)
        Kitchen is circle.Take radius from user
        Bedroom is square or Rectangle.Take length and width from user
        - Ask the user to delivery address (String, multiple words)
                - unitPriceForCarpet = 3.92
                - totalCost = area*unitPriceForCarpet;
        - Print in the following format:
        Ex:
        inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010
        "TotalCost for your carpet is 51.84 and it will be delivery
        1300 Lamar St Houston TX 77010 in one week"
                */
 //       Scanner input = new Scanner(System.in);
//        System.out.println("Which room do you need the carpet?");
//        String carpet = input.nextLine();
//        double unitPriceForCarpet = 10.75;
//        double area = 0;
//        double totalCost = 0;
//        boolean isValid = true;
//
//        switch (carpet) {
//            case "Bedroom":
//                System.out.println("Enter the length");
//                int length = input.nextInt();
//                System.out.println("Enter the width");
//                int width = input.nextInt();
//                area = length * width;
//                totalCost = area * unitPriceForCarpet;
//
//            case "Kitchen":
//                System.out.println("Enter the radius");
//                int radius = input.nextInt();
//                area += 3.14 * radius*radius;
//                totalCost = area * unitPriceForCarpet;
//                break;
//
//            default:
//                System.out.println("Invalid room type");
//                isValid = false;
//        }
//        if (isValid) {
//            //   totalCost = area * unitPriceForCarpet;
//            System.out.println("Please enter the address");
//            String empty = input.nextLine();
//            String address = input.nextLine();
//            System.out.println("TotalCost for your carpet is: $" + totalCost +
//                    " and it will be delivery to " + address);
//
//
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type one of them.\n\tList of Rooms\n\t\tBedroom\n\t\tKitchen");
            String roomType = scanner.nextLine().toLowerCase();
            boolean isValid = roomType.equals("bedroom") || roomType.equals("kitchen");
            double area=0;
            double unitPrice=3.92;
            if (isValid) {
                System.out.println("Calculating.....");
                switch (roomType){
                    case "bedroom":
                        System.out.println("Please enter your "+roomType+" dimensions ");
                        double width=scanner.nextDouble();     // 3    ENTER       scanner -- > ENTERENTER
                        double length=scanner.nextDouble();    // 4    ENTER
                        area=width*length;
                        break;
                    case "kitchen":
                        System.out.println("Please enter your "+roomType+" dimensions ");
                        double radius=scanner.nextDouble();
                        area=radius*radius*3.14;
                        break;
                }
                double totalCost=unitPrice*area;
                scanner.nextLine();   // To clear scanner memory    scanner -- >
                System.out.println("Please enter your address");
                String address= scanner.nextLine();

                System.out.println("TotalCost for your carpet is "+totalCost+" and it will be delivery "+address+" in one week");
            } else {
                System.out.println("Invalid Room Type");
        }

    }
}
