package day47_encapsulation.Bank;

public class BankOfAmerica {
    public static void main(String[] args) {
        System.out.println(DebitCard.accountType);

        DebitCard obj1 = new DebitCard(1234567891112141L, "James", 1.0000000);
        System.out.println(obj1);

        System.out.println();
        DebitCard obj2 = new DebitCard(123456789012L, "Ben", 1.00000002);
        System.out.println(obj2);
        System.out.println(obj2.accountType);
        System.out.println(DebitCard.accountType);


        // valid values
        System.out.println();
        DebitCard obj3 = new DebitCard(123456789012L, "James", 1.0000000, 1234, "visa");
        System.out.println(obj3);

        // invalid values
        System.out.println();
        DebitCard obj4 = new DebitCard(12345678901234L,"John", 59.000, 222, "Cas");
        System.out.println(obj4);

    }
}
