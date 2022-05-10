package day02_OfficeHours;

public class TimeConverter {
    public static void main(String[] args) {

        int inputSeconds = 5000;
        int hours,minutes,seconds;


           hours = inputSeconds / 3600;
           minutes = inputSeconds % 3600 / 60;
           seconds = inputSeconds % 60;

        System.out.println(hours+ " hours:" +minutes+  " minutes " +seconds+ " seconds");





















    }
}
