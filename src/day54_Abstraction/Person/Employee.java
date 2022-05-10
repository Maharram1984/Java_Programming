package day54_Abstraction.Person;

public abstract class Employee extends Person{

    public String jobTitle;
    public double salary;

    public Employee(String name, int age, String jobTitle, double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Name: " +name+ "\nAge: " +age+ "\nJobTitle: " +jobTitle+ "\nSalary: " +salary;
    }
}

/*    Create a class Employee
      make this class abstract
      inherits Person class
      define variables:
      job title, salary
      define abstract method:
      work()
      override the toString method  */


