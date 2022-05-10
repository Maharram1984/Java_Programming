package day07_Unary_ShorthandOperators;

public class store {

    public static void main(String[] args) {

        String store = "Target";
        int numberOfTv = 100;

        System.out.println(" Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTv);  // predecrement

        System.out.println(" Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTv);  // predecrement

        System.out.println(" Person comes into the store and put tv into their cart ");
        System.out.println(" Number of tvs in store:" + numberOfTv--);  // posrdecrement

        System.out.println(" Person bought it now PasswordCheck have: " + numberOfTv);

        System.out.println(" I get a shipment");
        numberOfTv = numberOfTv + 13;

        System.out.println("Tvs in stock: " +numberOfTv);










    }
}
