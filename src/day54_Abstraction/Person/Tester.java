package day54_Abstraction.Person;

public class Tester extends Employee {


    public Tester(String name, int age, String jobTitle, double salary) {
        super(name, age, jobTitle, salary);
    }

    @Override
    public void hobby() {
        System.out.println("Watching Soccer");
    }

    @Override
    public void work() {
        System.out.println("Running test cases");
    }

    public void attendMeeting() {
    }

    public void sleep() {
    }


    /*  Create a class Tester
        inherits Employee class
        implement hobby() and work() methods
        hobby(): create a print statement for your own hobbies
        work(): Running test cases
     */


}
