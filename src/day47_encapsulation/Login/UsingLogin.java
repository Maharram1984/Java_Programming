package day47_encapsulation.Login;

import day47_encapsulation.Login.Login;

public class UsingLogin {
    public static void main(String[] args) {

        Login obj = new Login();
     //   obj.username = "JamesBond";
     //   obj.password = "1234";
     // Can not access private variables directly

        obj.setUsername("Maharram");
        obj.setPassword("1234");// less than 8 --> null
     // System.out.println(obj.username);
     // System.out.println(obj.password);

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());

        obj.setPassword("James007");
        System.out.println(obj.getPassword());
    }
}
