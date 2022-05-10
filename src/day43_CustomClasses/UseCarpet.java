package day43_CustomClasses;

public class UseCarpet {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(false,5, 4, 10);
        System.out.println(carpet1);

        carpet1.length = 10;
        carpet1.calculatePrice();
        System.out.println(carpet1);


    }

}
