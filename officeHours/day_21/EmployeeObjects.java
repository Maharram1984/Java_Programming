package day_21;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee=new Employee("Mike",'M',24,150000);
        System.out.println(employee);

        // since it is private we need to access with PUBLIC GETTER and SETTER
        //employee.age=25;

        //change name
        employee.setName("");
        System.out.println(employee.getName());


        //change age
        employee.setAge(19);
        System.out.println(employee.getAge());

        //change salary
        employee.setSalary(100000);
        System.out.println(employee.getSalary());


        // increase the salary of employee +20K
        employee.setSalary(employee.getSalary()+20000);
        System.out.println(employee.getSalary());

        // decrease the salary of employee -30K
        employee.setSalary(employee.getSalary()-30000);
        System.out.println(employee.getSalary());

        // increase the salary of employee -30K
        employee.setSalary(employee.getSalary()+30000);
        System.out.println(employee.getSalary());


        System.out.println(employee.getGender());
        employee.setGender('F');
        System.out.println(employee.getGender());

    }
}
