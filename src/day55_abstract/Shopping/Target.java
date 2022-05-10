package day55_abstract.Shopping;

public final class Target extends Shopping {
    /* Create a concrete class Target
     - Make the class final
     - Inherit Shopping and implement all abstract methods */

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }

}
