package day48_Encapsulation.Pizza;

public class UsePizza {
    public static void main(String[] args) {

        Pizza first = new Pizza("large", 3);
        System.out.println(first);
        // first.numberOfToppings = 2;
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza("", -2);
        // second.numberOfToppings = -2;
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(1);
        System.out.println(second);

        Pizza third = new Pizza("Medium",5);
        third.calculatePrice();
        System.out.println(third);

    }
}
