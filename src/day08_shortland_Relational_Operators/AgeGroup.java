package day08_shortland_Relational_Operators;

public class AgeGroup {
    public static void main(String[] args) {

        int age = 40;
        boolean isKid = age < 13;
        boolean isSenior = age > 12;

        System.out.println("You are a kid: " + isKid);
        System.out.println("You are a senior citizen: " + isSenior);



        int number = 80;

        boolean isPositive = number > 0;
        boolean isNegetive = number < 0;
        boolean isZero = number == 0;


        System.out.println(number + " isPozitive: " + isPositive);
        System.out.println(number + " isNegetive: " + isNegetive);
        System.out.println(number + " isZero: " + isZero );





    }
}
