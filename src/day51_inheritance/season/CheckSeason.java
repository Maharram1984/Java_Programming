package day51_inheritance.season;

public class CheckSeason {
    /*  Create a class CheckSeason
	    create an object of Winter, Summer, Fall and Spring
	    and verify if constructor, toString(), and activity()
	    are working properly for each class
	    List is a relations of all the classes */
    public static void main(String[] args) {

        Winter obj1 = new Winter();
        System.out.println(obj1);
        System.out.println(obj1.activity());

        Spring obj2 = new Spring(75,40);
        System.out.println(obj2);
        System.out.println(obj2.activity());

        Summer obj3 = new Summer(65);
        System.out.println(obj3);
        System.out.println(obj3.activity());

        Fall obj4 = new Fall(70);
        System.out.println(obj4);
        System.out.println(obj4.activity());

    }
}