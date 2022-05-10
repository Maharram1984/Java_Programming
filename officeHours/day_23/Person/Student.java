package day_23.Person;

public class Student extends Person{
    /*  variables: name, gender, age, schoolName, studentId
    methods: study(), attendClass() */

   private String schoolName;
   private int studentID;

    public Student(String name, char gender, int age, String schoolName, int studentID) {
        super(name, gender, age);
        this.schoolName = schoolName;
        this.studentID = studentID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public void study(){
        System.out.println(getName()+" is studying");
    }
    public void attendClass(){
        System.out.println(getName()+" is attending Class");
    }
    public String toString(){
        return super.toString()+" ID: "+studentID+" School Name: "+schoolName;
    }
}
