package day_23.Person;

public class Employee extends Person{
    /*variables: name, gender, age, jobTitle, employeeID, salary
    methods: work(), attendMeeting() */

   private String jobTitle;
   private int employeeID;
   private double salary;

    public Employee(String name, char gender, int age, String jobTitle, int employeeID, double salary) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getName()+" is attending Meeting");
    }
    public String toString(){
        return super.toString()+" Job Title: "+jobTitle+" Employee ID: "+employeeID+" Salary: "+salary;
    }
}
