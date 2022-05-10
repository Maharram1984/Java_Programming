package day55_abstract.Animal;

public class Lizard extends Reptile{

    String skinColor;
    @Override
    public void eat() {
        System.out.println("Lizard is eating");
    }
}
