package day54_Abstraction.Person;

public abstract class Person {
/* Create a class Person
   make this class abstract
   define variables:
   name, age
   define abstract method:
   hobby()   */

   public String name;
   public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void hobby();




}
