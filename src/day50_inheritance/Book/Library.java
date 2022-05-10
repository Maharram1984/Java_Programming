package day50_inheritance.Book;

public class Library {
    public static void main(String[] args) {

        // not doing any inheritance here, just a main method to create my objects

        Book obj1 = new Book();
        obj1.price = 55;
        // obj1 will have access to 6 instance variables
        System.out.println(obj1.price);
        AudioBook obj2 = new AudioBook();
        obj2.narrator = new String("James Bond");
        System.out.println(obj2.narrator);
        // obj2 has access to the 6 variables from the Book class and the 2 new variables in the AudioBook class:
        obj2.duration = 100;
        obj2.narrator = "Morgan Freeman";
        // obj2 has access to the instance method listen()
        obj2.title = "Java is fun";
        obj2.listen();
        System.out.println(obj2.title);
        EBook obj3 = new EBook();
        obj3.pages = new Integer(100000);
        System.out.println(obj3.pages);
        // obj3 has access to the 6 variables from the Book class and the 2 new variables in the EBook class:
        obj3.size = 20.4;
        obj3.pages = 1004;
        // obj3 has access to the instance method read()
        obj3.title = "Soft skills is important";
        obj3.read();
        System.out.println(obj3.title);

        Book obj4 = new Book();
        obj4.author = new Author("JK Rowling",444444444);
        // made an Author it belongs to the Book obj4 objects
        System.out.println(obj4.author);
        System.out.println(obj4.author.getName());




    }
}
