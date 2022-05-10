package day4_variables;

public class PrintDate {

    /*
       TASK:
          declare and assign 3 variables
          the month number, the day number and year number

          print the date in the following format:
          month/day/year
     */
    public static void main(String[] args) {

        int month = 2;
        int day = 5;
        int year = 2022;
        System.out.println(month+"/"+day+"/"+year);
        System.out.println(month+"-"+day+"-"+year);
        System.out.println(month+"|"+day+"|"+year);
        System.out.println(month+"="+day+"="+year);


        int _month = 5;
        int _day = 30;
        int _year = 1984;

        System.out.println("Maharram's birthday:" + _month + "/" + _day + "/" + _year);
        System.out.println("Natavan's did not born in the same data: " + _month + "/" + _day + "/" + _year);



        byte age = 60;
        System.out.println("age");
        System.out.println(age);

//        byte age2 = 200; 200 is too big for byte type

        short year1;  // declared a variable called year. It is short type
        year1 = 2022; // assigned 2022 into my year variable
        System.out.println(year1);


        int addressNumber = 2444400;

        // long bigNumber = 19481840955959; the value is int type, it is too big for int

        long bigNumber;
        bigNumber = 9481840955959L; // adding L to the number, tells the compiler it is a Long number



















    }








}
