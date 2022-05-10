package day_23.Person;

public class Runner {
    public static void main(String[] args) {
        Tester tester = new Tester("Mike",'M',35,"SDET",1,120000);
        System.out.println(tester);
        tester.work();
        tester.attendMeeting();
        tester.drink("tea");
        System.out.println("==========================");
        Teacher teacher = new Teacher("Mehmet",'M',37,"Teacher",2,130000);
        System.out.println(teacher);
        teacher.work();
        teacher.attendMeeting();
        teacher.sleep();
        teacher.drink("Water");
        System.out.println("==========================");
        Developer developer = new Developer("Victoria",'F',34,"Developer",3,150000);
        System.out.println(developer);
        developer.work();
        developer.attendMeeting();
        developer.eat("sneakers");
        developer.drink("coffee");
        developer.sleep();
        System.out.println(developer.getEmployeeID());
        System.out.println("==========================");
        Student student = new Student("John",'M', 40,"Cydeo",141);
        System.out.println(student);
        student.study();
        student.attendClass();
        student.drink("Water");
        student.eat("Cake");
        student.sleep();
    }
}
