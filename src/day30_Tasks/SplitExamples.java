package day30_Tasks;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[] days = s.split(",");    //cutting ,without
        System.out.print(Arrays.toString(days)); //[monday, tuesday, wednesday, thursday, friday, saturday, sunday]

        System.out.println();
        for (String day : days) {
            System.out.println(day.substring(0, 1).toUpperCase() + day.substring(1)); //Monday Tuesday Wednesday etc...
        }
        System.out.println();

        String[] withoutDay = s.split("day");    //cutting,without
        for (String each : withoutDay) {         // or :  s.split("day")
            System.out.print(each);  //mon,tues,wednes,thurs,fri,satur,sun-->> withoutDay

        }
        System.out.println();

        String str = "Jan-Feb-Mar-Apr-May-Jun-Jul-Avq-Oct-Nov-Dec";

        String[] months = str.split("-"); //cutting,without
        for (String each : months) {
            System.out.print(each);       //JanFebMarAprMayJunJulAvqOctNovDec
        }
        System.out.println();

        String withoutDin = "Aladdin,Necmeddin,Niyameddin,Saleddin,Kemalleddin,Imameddin,Nesreddin,Haceddin,Nureddin";
        for (String din : withoutDin.split("din")) {   //cutting
            System.out.print(din);
        }


    }
}
