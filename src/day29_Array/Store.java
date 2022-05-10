package day29_Array;

public class Store {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack"};
        double[] prices = {89.99, 150.0, 29.99, 250.0, 439.5, 39.99};
        int[] itemIds = {12345, 12346, 12347, 12348, 12349, 12350};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item ID: " + itemIds[i] + " Name: " + items[i] + " Price: $" + prices[i]);
        }
        System.out.println();
        // TASK: Find the index of Gloves
        int indexOfGloves = 0;                           //-1
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("gloves")) {
                indexOfGloves = i;
                break;
            }
        }
        System.out.println("Index of Gloves: " + indexOfGloves);

        System.out.println();
        // TASK: Find the most expensive item. Name, price, id.
        double mostExpensive = prices[0];
        int indexOfMostExpensive = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > mostExpensive) {
                mostExpensive = prices[i];
                indexOfMostExpensive = i;
            }
        }
        System.out.println("The most expensive item: ");
        System.out.println("Item: " + items[indexOfMostExpensive]);
        System.out.println("Item ID: " + itemIds[indexOfMostExpensive]);
        System.out.println("Price: $" + prices[indexOfMostExpensive]);
    }
}
