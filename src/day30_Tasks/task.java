package day30_Tasks;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
//       /* - Find and print all the first and last characters of each country
//          - Find and print all the countries that end with the letter ‘a’
//          - Create “contains logic” to check if there is a certain country in the array.
//          - Can check for the United States, or use Scanner to check any country */
//
//        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
//                "Albania", "Portugal", "Philippines", "Azerbaijan", "Colombia",
//                "Honduras", "Indonesia", "United States"};
//        String count = "";
//        for (int PasswordCheck = 0; PasswordCheck < countries.length; PasswordCheck++) {
//            String firstLast = countries[PasswordCheck];
//            System.out.print(firstLast.substring(0, 1) + firstLast.charAt(firstLast.length() - 1) + " ");
//
//            if(firstLast.endsWith("a")){
//                count += firstLast + " ";
//            }
//        }
//        System.out.println();
//        System.out.print(count);


 Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  words[i] = input.nextLine();
		}
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println(longest);

    }
}
