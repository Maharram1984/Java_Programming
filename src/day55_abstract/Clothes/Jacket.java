package day55_abstract.Clothes;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear() {
        System.out.println("Wearing a jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting a jacket on hood");
    }
}
