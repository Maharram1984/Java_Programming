package day03_02_02_2022;

public class CodlityTest {
    public static void main(String[] args) {
        int number = 2;
        String result = "";

        if (number % 2 == 0) {
            System.out.print("Codility+");
        }if (number % 3 == 0) {
            System.out.print("Test+");
        }if (number % 5 == 0) {
            System.out.print("Coders");


        }if (number % 2 == 0 & number % 3 == 0 && number % 5 == 0) {
            result = "CodilityTestCoders";
        } else if (number % 2 == 0 & number % 3 == 0) {
            result = "CodilityTest";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "TestCoders";
        }else if (number % 2 == 0 && number % 5 == 0){
           result = "CodilityCoders";
        } else if (number % 2 == 0) {
            System.out.println("Codility+");
        } else if (number % 3 == 0) {
            System.out.println("Test+");
        } else if (number % 5 == 0) {
            System.out.println("Coders");
        }

        System.out.println(result);







    }
}





























