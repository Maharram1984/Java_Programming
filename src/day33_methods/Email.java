package day33_methods;

import java.util.Locale;

public class Email {
    public static void buildEmail(String name,String chc, String domain) {
        String email = name.substring(0, 1);                // M
        int space = name.indexOf(" ");
        email += name.substring(space + 1).toLowerCase();   // Mrefiyev
        email += chc + "@" + domain.toLowerCase() + ".com";
        System.out.println(email);
    }
    public static void main(String[] args) {
        buildEmail("James Bond","", "Gmail");
        buildEmail("Maharram Rafiyev","84", "Gmail" );
    }
    }
