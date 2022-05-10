package day_23.Person;

public class Person {
    /*   1. create a class named Person
            variables: name, gender, age
            methods: eat(), sleep(), drink()     */
    private String name;
    private final char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+ " is eating "+food);
    }
    public void drink(String beverages){
        System.out.println(name+ " is drinking " +beverages);
    }
    public void sleep(){
        System.out.println(name+ " is sleeping ");
    }
    public String toString(){
        return "Name: "+name+ " Gender: "+gender+" Age: "+age;
    }
}
