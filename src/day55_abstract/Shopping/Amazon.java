package day55_abstract.Shopping;

public final class Amazon extends OnlineShopping{
    /*Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods */
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon cart");
    }
    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shipping" : "Free shipping");
    }
    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }
    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }
}
