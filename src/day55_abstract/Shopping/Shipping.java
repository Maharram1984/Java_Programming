package day55_abstract.Shopping;

public interface Shipping {
    /* Create an interface Shipping
     - Declare an abstract methods:
        payForShipping(boolean) */

    String country = "US";
    public abstract void payForShipping(boolean b);
}
