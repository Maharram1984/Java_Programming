package day03_02_02_2022;

public class ifElseSmallTask {
    public static void main(String[] args) {

        int x = 5;
        int y = 4;

        if (x == y) {
            System.out.println("square");    //it is square
        } else {
            System.out.println("Triangle");
        }

        int quantity = 15;
        int unitPrice = 100;
        double totalCost = quantity * unitPrice;
        double discountRate = 0.1;
        double totalDiscount = 0;

        if (totalCost >= 1000) {
            totalDiscount = discountRate * totalCost;
            System.out.println("You got $"+totalDiscount+
                    "discount and your total cost is $"+(totalCost-totalDiscount));
        } else {
            System.out.println("No discount applied");
        }















    }
}