package day12_if_statemens;

public class Overtime {
    public static void main(String[] args) {

        double hourlyRate = 20;
        double numberOfHours = 40;
        double netPay;
        String message;

        if (numberOfHours > 40) {
            // when the number of hours is more than 40,we will get extra 1.5 for overtime pay
            double overtimeHours = numberOfHours - 40;
            netPay = 40 * hourlyRate;
            netPay += overtimeHours * hourlyRate * 1.5;
            message = "You worked " +numberOfHours + " hours at a rate of \n$" + hourlyRate +
                    " but, " +overtimeHours + " hours were overtime,\nyou will get additional pay. " +
                    " \nYour net pay is now: $" + netPay;
        } else {
            // when the number of hours is less than or equal to 40,we will run this code
            netPay = numberOfHours * hourlyRate;
            message = "You worked " + numberOfHours + " hours at a rate of \n$" + hourlyRate + " there was " +
                    "not overtime. \nYour net pay is $" + netPay;
        }

        System.out.println(message);

    }
}
