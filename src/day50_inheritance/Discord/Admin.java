package day50_inheritance.Discord;

public class Admin extends DiscordUserClass {
    /*   Create a class Admin
       - Admin class inherits DiscordUser class
       - create constructor to call parent constructor and set up variables (role - Admin, name, id)
       - create method: -->> createChannel()
       - Example output: prints Creating new discord channel */

    public Admin() {
        super("Mentor", "Jimmy", 7789);
    }

    public void creatChannel() {
        System.out.println("Creating new Discord channel");
    }

}
