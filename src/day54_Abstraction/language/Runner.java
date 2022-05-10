package day54_Abstraction.language;

public class Runner {

    public static void main(String[] args) {

      //  Language language = new Language();
        //Cannot create objects of interface

        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        System.out.println();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();

        System.out.println(Language.PLANET);
    }
}
