package day43_CustomClasses;

public class UsingPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("IPhone 12","Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("Galaxy s 22","Samsung",128,10.2);
        System.out.println(phone3);

        Phone phone4 = new Phone("Galaxy s 18","Samsung",256,10.2);
        System.out.println(phone4);
    }

}
