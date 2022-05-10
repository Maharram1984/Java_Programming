package day_23.Person;

public class Teacher extends Employee{
      /* variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting() */

    public Teacher(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age, jobTitle, employeeID, salary);
    }
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending Meeting");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" is sleeping ");;
    }
}
