package day43_CustomClasses;

public class ThisKeyword {

    int a = 100; // instance variable

    public ThisKeyword(int a){ // local var
        a = 400;
        System.out.println(a);
        this.a = 600; // assigned

    }
}
