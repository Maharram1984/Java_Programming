package day54_Abstraction.Person;

public class Chef extends Employee {


    public Chef(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Cooking three-course meal ");
    }

    @Override
    public void hobby() {
        System.out.println("Trying new food");
    }
  /*  Create a class Chef
      inherits Employee class
      implement hobby() and work() methods
      hobby(): Trying new food
      work(): Cooking three-course meal    */
}
