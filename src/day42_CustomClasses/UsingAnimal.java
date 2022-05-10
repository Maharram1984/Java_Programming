package day42_CustomClasses;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 1000000;
        bird.species = "Bird";
//        System.out.println(bird);
        System.out.println(bird.toString());
    }
}
