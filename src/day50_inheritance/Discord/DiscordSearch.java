package day50_inheritance.Discord;

public class DiscordSearch {

    public static void main(String[] args) {

        DiscordUserClass obj1 = new DiscordUserClass("Mentor", "Kelly", 7777);
        System.out.println(obj1);
        System.out.println("=============");
        Admin obj2 = new Admin();
        obj2.creatChannel();
        System.out.println(obj2);
        System.out.println("=============");
        Student obj3 = new Student("Kevin");
        obj3.sendMessage();
        System.out.println(obj3);
    }
}
