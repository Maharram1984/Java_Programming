package day09_scanner;

public class GoForWalk {
    public static void main(String[] args) {

        boolean isItRaining = true;
        int temperature = 80;

        System.out.println(isItRaining && temperature > 70);    // TRUE
        System.out.println(!isItRaining && temperature > 70);   // FALSE
        System.out.println(!isItRaining || temperature < 70);   // FALSE
        System.out.println(!isItRaining || temperature > 70);   // TRUE

        System.out.println("go for walk: " + (isItRaining && temperature > 70));

















    }
}
