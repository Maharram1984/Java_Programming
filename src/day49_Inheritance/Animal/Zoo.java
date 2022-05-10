package day49_Inheritance.Animal;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Max";
        dog.breed = "Husky";
        dog.size = "Large";
        dog.age = 5;
        dog.color = "Gray";
        dog.gender = 'M';
        dog.price = 5000;

        dog.bark();  // own method called
        dog.sleep(); // inheritance method called
        System.out.println(dog);
        System.out.println();

        Cat cat = new Cat();

        cat.name = "Tom";
        cat.breed = "Ragdoll";
        cat.size = "Small";
        cat.age = 2;
        cat.color = "White";
        cat.gender = 'F';
        cat.price = 1500;

        cat.scratch();// own method called
        cat.sleep();  // inheritance method called
        System.out.println(cat);
        System.out.println();

        Fish fish = new Fish();

        fish.name = "Combo";
        fish.breed = "Clownfish";
        fish.size = "Medium";
        fish.age = 5;
        fish.color = "RedBlack";
        fish.gender = 'M';
        fish.price = 400;

        fish.swim();   // own method called
        fish.sleep();  // inheritance method called
        System.out.println(fish);



    }
}
