package day13_task;

public class TernaryExamples {
    public static void main(String[] args) {

        int a = 5;
        String evenOrOdd;

        if(a % 2 == 0){
            evenOrOdd = "Even";
        }else {
            evenOrOdd = "Odd";
        }

        String result = a % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd);
        System.out.println(result);
        System.out.println("-------------------------------------------------------");

        int num = 0;
        String posOrNeg;

        if(num > 0){
           posOrNeg = "positive";
        }else if(num < 0){
            posOrNeg = "negative";
        }else {
            posOrNeg = "zero";
        }
        System.out.println(posOrNeg);

           String sign = (num > 0) ? "positive" : (num < 0)? "negative" : "zero";
        System.out.println(sign);
        System.out.println("-----------------------------------------------------------------------------");

        int time = 9;
        double price;

        if(time >= 8 && time <= 12) {
            price = 7.99;
        }else {
            price = 10.99;
         }
        System.out.println(price);


          double ternaryPrice = (time >= 8 && time <= 12) ? 7.99 : 10.99;
          System.out.println(ternaryPrice);

        System.out.println("-------------------------------------------------------------");
        System.out.println(true ? "good" : "bad");
        System.out.println(false ? "good" : "bad");
        System.out.println(false ? "Negative" : "Positive");
        System.out.println(true ? "Negative" : "Positive");
        System.out.println(true ? "Hello" : "Bye");
        System.out.println(false ? "Hello" : "Bye");           // ?(if) = true
        System.out.println(false?"Real":"Barca");              // :(else) = false













    }
}
