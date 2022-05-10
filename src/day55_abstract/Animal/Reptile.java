package day55_abstract.Animal;

public class Reptile extends Animal{
    int numberOfClaws;
    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
}
