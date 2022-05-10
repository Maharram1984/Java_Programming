package day44_CustomClasses;

import PrimitiveDataTypes.Char;
import day43_CustomClasses.Car;

public class ChainExample {

    public ChainExample(){
      //  this(4);  this is not valid because chaining contain themselves
        System.out.println("First");
    }

    public ChainExample(int i){
        this();
        System.out.println("Second");
    }

    public ChainExample(String s){
        this();
        System.out.println("Third");
    }
    public ChainExample(double d){
        this("0");       // this(0);-->> will print int
        System.out.println("Fourth");
    }

}
