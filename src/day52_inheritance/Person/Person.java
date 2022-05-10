package day52_inheritance.Person;

public class Person {
    String name = "James Bond";
}
class SecretIdentity extends Person{

    String name = "James"; // we created another name variable in the SUBCLASS, but it was already inherited, so now we are hiding the one from the PARENT class
}
class SecretIdentity2 extends Person{String name = "John";}
class SecretIdentity3 extends Person{}

class Runner {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity obj1= new SecretIdentity();
        System.out.println(obj1.name);

        SecretIdentity2 obj2 = new SecretIdentity2();
        System.out.println(obj2.name);

        SecretIdentity3 obj3 = new SecretIdentity3();
        System.out.println(obj3.name);
    }
}
