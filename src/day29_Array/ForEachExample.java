package day29_Array;

public class ForEachExample {
    public static void main(String[] args) {

//        int [] nums = {10,20,30,152};
//
//        for (int PasswordCheck = 0; PasswordCheck < nums.length; PasswordCheck++) {
//            System.out.println("traditional " + nums[PasswordCheck]);
//        }
//        System.out.println("----------------------------------------------");
//        for (int element : nums) {
//            System.out.println("for each: " + element);
//        }

        System.out.println("---------------------------------------------");
        String[] classes = {"java", "soft skills", "selenium", "database", "api"};
        String longer = classes[0];
        String shorter = classes[0];
//        for(String str : classes){
//            if(str.length() > longer.length()){                 // for each
//                longer = str;
//            }if(str.length() < shorter.length()){
//                shorter = str;
//            }
//        }
        for (int i = 0; i < classes.length; i++) {                 // Traditionally
            if(classes[i].length() > longer.length()) {
                longer = classes[i];
            }if(classes[i].length() < shorter.length()){
                shorter = classes[i];
            }
        }
        System.out.println(longer+"\n"+shorter);
//        System.out.println("--------------------------------------------");
//        for (String word : classes){
//            System.out.println(word);
//        }
//        System.out.println("---------------------------------------------");
//
//        double[] prices = {10.4, 40.2, 410.1};     // for each
//        for (double each : prices){
//            System.out.println("$" +each);
//        }


    }
}
