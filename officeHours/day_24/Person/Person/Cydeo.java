package day_24.Person.Person;

public class Cydeo {
    public static void main(String[] args) {

        Student student=new Student("Mike",'M',25,1,"Cydeo");
        System.out.println(student);
        student.study();
        student.attendClass();
        student.drink("tea");
        student.sleep();
        student.eat("sneakers");
        student.setSchoolName("yol");
        System.out.println(student.getSchoolName());


        Tester tester = new Tester("John",'M',30,"SDET",2,150000);
        System.out.println(tester);
        // OVERRIDEN METHODS
        tester.attendMeeting();
        tester.work();
        tester.drink("coffee");
        tester.setSalary(200000);
        System.out.println(tester.getSalary());

        // COMES FROM PARENTS
        tester.eat("pizza");
        tester.sleep();



    }
}
