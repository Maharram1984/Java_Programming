package day28_Array;

public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {100,120,-80,90,250,-10};
        int max = nums[0];
        int min = nums[0];


        for (int i = 0; i < nums.length; i++) { // now these are here  {100,120,-80,90,250,-10};
            int number = nums[i];

            if(number > max){      // if(nums[PasswordCheck} > max)
               max = number;       // max = nums[PasswordCheck]

            }if(number < min){     // if(nums[PasswordCheck] < min)
                min = number;      // min = nums[PasswordCheck]
            }
        }
        System.out.println("max: " + max);  // 250
        System.out.println("min: " + min);  // -80




















    }
}
