package ATaskWithVictoria;

    public class ArmstrongNumbersWithVictoria {


//    Write a method that can check if a number is Armstrong number
//
//    Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number.
//    If the number obtained equals the original number then, we call that armstrong number.
//
//
//    print all the armstrong numbers with three digit
//    Armstrong numbers are     === 153 370 371 407 === for 3 digits
//
//                 153   ==  (111)+(555)+(333)
//                         1       125      27  == 153
//             23==(22)+(33)
//             23==4+6

        public static void  armstrong(int num){
            String numbers= "" + num; // integer 153 it is going to be String "153"
            int sum = 0;
            int multiply = 1;
            int [] arr = new int [numbers.length()];// numbers.length = 3
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(numbers.charAt(i)+"");// String "153" is going to be int [1,5,3]
                for (int j = 0; j < arr.length; j++) {
                    multiply *= arr[i];
                }
                sum += multiply;
                multiply = 1;
            }
            System.out.println(sum == num?"armstrong":"not armstrong");
        }
        public static void main(String[] args) {

            int num = 153;
            armstrong(num);
        }




    }

