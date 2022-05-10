package day07_Unary_ShorthandOperators;

public class Shopping {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("We pick up 1 water");
        System.out.println("How many items in the cart:" + ++numberOfItems);
        price = price + 2.5;  // take the price value which is 0 add 2.5,
                             // and reassigned to the price variable

        System.out.println("we pick up 2 eggs");
        System.out.println("How many items in the cart:" + ++numberOfItems);
        System.out.println("How many items in the cart:" + ++numberOfItems);

        System.out.println(numberOfItems++); // post increment
        System.out.println(numberOfItems);
        System.out.println(price);


    }
}
