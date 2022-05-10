package day17_String_Class;

public class StringMethods1 {
    public static void main(String[] args) {

        String met1 = "Wooden Spoon";           //charAt();-- >> return to char

       // met1.charAt(0);
        System.out.println(met1.charAt(1));     //index number

        char cn1 = met1.charAt(0);
        char cn2 = met1.charAt(7);
        char cn3 = met1.charAt(0);
        System.out.println(cn1);
        System.out.println(cn2);
        System.out.println(cn3);
        System.out.println("--------------------------------------");

        String met2 = "Wooden Spoon";           // length();     -- >> return to int
                                                // uzunluq
        met2.length();
        System.out.println(met2.length());

        String onlyOneWord = "Elektirikleshdirilmemishlerimizdensinizmi";
        System.out.println(onlyOneWord.length());

        int numOfLength = met2.length();
        System.out.println("numOfLength = " + numOfLength);  //12 letters
        int lastIndex = met2.length() - 1;
        System.out.println("lastIndex = " + lastIndex);      //11 indexes always one less

        String last = "Today was fun day!";
        System.out.println(last.length());
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN DAY!")); // it checks letter to letter
        System.out.println("---------------------------------------");


        String met3 = "Wooden Spoon";               //  lowerCase();  -- >> return to String

        met3.toLowerCase();
        System.out.println(met3.toLowerCase());

        met3 = met3.toLowerCase();
        System.out.println(met3);
        System.out.println("----------------------------------------");

        String met4 = "Wooden Spoon";                // upperCase();  -- >> return to String

        met4.toUpperCase();
        System.out.println(met4.toUpperCase());

        met4 =  met4.toUpperCase();
        System.out.println(met4);
        System.out.println("-----------------------------------------");

        String met5 = "   Wooden Spoon   Today      ";       // trim(); -- >> return to String
                                                             // to cut empty spaces
        met5.trim();
        System.out.println(met5.trim());

        met5 = met5.trim();
        System.out.println(met5);
        System.out.println("------------------------------------------");

        String met6 = "Wooden Spoon";              // indexOf();    -- >> return to int

        met6.indexOf("W");
        System.out.println(met6.indexOf("W"));                     //charAt(number) VS indexOf(letter)

        int indexNumOfFirstO = met6.indexOf("o");
        System.out.println("indexNumOfFirstO = " + indexNumOfFirstO);
        int indexNumOfSecondO = met6.indexOf("od");
        System.out.println("indexNumOfSecondO = " + indexNumOfSecondO);
        int indexNumOfThirdO = met6.indexOf("oon");                    //or by adding (po)+1;
        System.out.println("indexNumOfThirdO = " + indexNumOfThirdO);
        int indexNumOfForthO = met6.indexOf("on");
        System.out.println("indexNumOfForthO = " + indexNumOfForthO);
        int indexNumOfS = met6.indexOf("S");
        System.out.println("indexNumOfS = " + indexNumOfS);
        System.out.println("-------------------------------------------");


        String met7 = "Wooden Spoon";           //lastIndexOf();-- >> return to int

        met7.lastIndexOf("0");
        System.out.println(met7.lastIndexOf("p"));

        int indexNumOfLastO = met7.lastIndexOf("o");
        System.out.println("indexNumOfLastO = " + indexNumOfLastO);













    }
}
