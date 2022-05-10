package day_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

            String str = "AAABBCDDDDEEE";
            String result = "";             // A3B2C1D4E3

          ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
          for(String each : list){
              int count = Collections.frequency(list,each);
              if(result.contains(each)){
                  continue;
              }
              result += each + count;
          }
        System.out.println(result);
        }
    }
