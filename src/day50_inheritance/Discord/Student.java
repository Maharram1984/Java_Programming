package day50_inheritance.Discord;

public class Student extends DiscordUserClass {
 /*  Create a class Student
   - Student class inherits DiscordUser class
   - create constructor to call parent constructor and set up variables (role - Student, name, id)
   - create method: -->>  sendMessage()
   - Example output: prints Sending message to class chat */

    public Student(String name) {
        super("Student", name, 7721);
    }

    public void sendMessage(){
        System.out.println("Sending message to class chat");
    }
}
