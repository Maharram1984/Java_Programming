package ArraylistTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllThrees {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(3,3,3,7,3,3,3,1,3,3,3));
        System.out.println(num);
        for (int i = 0; i < num.size() ; i++) {
            if(num.get(i) == 3){
                num.remove(i);
            }
        }
        for (int i = 0; i < num.size() ; i++) {
            if(num.get(i) == 3){
                num.remove(i);
            }
        }
        System.out.println(num);


       ArrayList<Integer> numb = new ArrayList<>(Arrays.asList(1, 3,3,3,3,3,3,3,3,3,3,3,3 ,4, 4, 3, 3, 1));
            for (int i = 0; i < numb.size(); i++) {
            numb.removeAll(Arrays.asList(3));
        }
        System.out.println(numb);

    }
}





