package day03_comments_escape_sequence;

public class Quotes {
    public static void main(String[] args) {

        /*  How can you output this:

           I like "Java" programming
//         */
//         System.out.println("I like \"Java\"programming");
//         System.out.println("\"This is a quote\"");

/* the first quote is before java printing the text
   the second one is to print the " quotation mark in the console
 */
        System.out.println("A\\B\\C\\D"); // this will print for one backslash
        System.out.println("user\\mrefi\\ideaproject");
        System.out.println("user\\\\\\user");//this will print for two backslash
        System.out.println("user\\\"user\"");
        System.out.println("abc/dfe");

//        System.out.println("___");
//        System.out.println("\t|");
//        System.out.println("   ___");
//        System.out.println("\t\t|");






    }



}
