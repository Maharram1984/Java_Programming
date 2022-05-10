package day11_IF_Else;

public class IfElse {
    public static void main(String[] args) {

        int score = 60;
        if (score >= 75) {
            System.out.println("Passing");
        }
        if (score <= 75) {
            System.out.println("Failing");
            {

                int year = 2022;
                boolean lockdown = year == 2020 || year == 2021;
                if (lockdown) {
                    System.out.println("Stay at home!");
                    System.out.println("Please");
                    System.out.println("U have too");
                }

                if (!lockdown) {
                    System.out.println("Party");
                    System.out.println("Maybe travel");
                    System.out.println("still practice java");


                }


            }
        }}}