package day_23.Person;

public class Tester extends Employee{
    /* variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting() */

    public Tester(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending Meeting");
    }

    @Override
    public void drink(String beverages) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+beverages);;
    }
}
