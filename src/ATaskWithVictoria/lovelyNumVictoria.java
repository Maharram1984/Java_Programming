package ATaskWithVictoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lovelyNumVictoria {
     /*        We consider a number to be lovely if it contains fewer than
               three instances of any distinct digit (in decimal representation).
               Examples of lovely numbers: 0, 100, 1232 and 9922;
               Examples of numbers that are not lovely:
                               1000 (contains three copies of digit '0'),
                               33533 (contains four copies of digit '3').
                       Examples:
                       lovelyNumber(0)    ---returns 1
                       lovelyNumber(100)  ---returns 1
                       lovelyNumber(111)  ---returns 0
                       lovelyNumber(1232) ---returns 1
                       lovelyNumber(9922) ---returns 1
                       lovelyNumber(99922)---returns 0
                       In your solution, focus on correctness. The performance of your
                       solution will not be the focus of the assessment. */
        public static Integer lovelyNumber(int num){
            int count =0;
            String []name = String.valueOf(num).split("");
            ArrayList<String> list=new ArrayList<>(Arrays.asList(name));
            for (String each : list) {
                count = Collections.frequency(list,each);
                if (count>2){
                    return 0;
                }
            }
            return 1;
        }
        public static void main(String[] args) {
            System.out.println(lovelyNumber(0));
            System.out.println(lovelyNumber(100));
            System.out.println(lovelyNumber(111));
            System.out.println(lovelyNumber(1232));
            System.out.println(lovelyNumber(9922));
            System.out.println(lovelyNumber(99222));
        }
    }

