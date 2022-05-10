package day50_inheritance.Discord;

public class DiscordUserClass {
 /* - Create an DiscordUser class
    - create variables: -->> role, name, id
    - create constructor to initialize the variables
    - create a toString() method */
    String role;
    String name;
    int id;

    public DiscordUserClass(String role, String name, int id) {
        this.role = role;
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return "DiscordUserClass{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
