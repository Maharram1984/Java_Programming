package day28_Array;

public class AddElements {
    public static void main(String[] args) {
        
        
       int [] numbers = {5,7,9,12};
      //  System.out.println("Hard coded: " +numbers[0]+numbers[1]+numbers[2]);
       int summary = 0;

        for (int i = 0; i < numbers.length ; i++) {
            summary += numbers[i];
        }
        System.out.println(summary);


        int [] num = {5,5,5*5,5};
        int sum = 0;
        for (int i = 0; i <num.length; i++) {
            sum += num[i];

        }
        System.out.println(sum);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
