package day15_nestedIf;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is genre of the book?");
        String genre = input.next();
        int pageLength = 0, sequels = 0, countries = 0, profit = 0;
        boolean isAvailable = true;

        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Wrong information");
                 isAvailable = false;
        }
        if (isAvailable) {
            System.out.println("\tGenre:\t\t" + genre + "\n\tPage length:" + pageLength + "\n\tProfit:\t\t" +
                    profit + "\n\tSequels:\t" + sequels + " year\n\tCountries:\t" + countries);
        }


    }
}
