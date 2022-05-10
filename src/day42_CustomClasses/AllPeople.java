package day42_CustomClasses;

public class AllPeople {
    public static void main(String[] args) {

        //        System.out.println(name);
        //        System.out.println(Person.name);
        //        These are not a valid way

        Person personOne = new Person();
        Person personTwo = new Person();

        personOne.name = "James";
        personOne.age = 40;
        personOne.height = 5.1;
        personOne.isMarried = false;

        System.out.println(personOne.name);
        System.out.println(personOne.age);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        System.out.println();

        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);


    }
}
