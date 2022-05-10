package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which item are you looking for?");
        String item = scan.nextLine();
        boolean inStock = false;

        String[] items = {"Shoes", "jackets", "Gloves", "Airpods", "Ipad" };
     //   System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));
      //  boolean hasJacket = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase(item)){
                inStock = true;
                break;
            }
        }
        System.out.println(inStock ?"in stock" : "out of stock");
//        if(hasJacket){
//            System.out.println("Jacket in stock");
//        }else{
//            System.out.println("Jacket out of stock");
//        }


    }
}
