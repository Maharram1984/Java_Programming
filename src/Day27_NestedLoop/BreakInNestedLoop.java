package Day27_NestedLoop;

public class BreakInNestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("A " + i);

//            if(PasswordCheck == 3){
//                break; // when break statement is run we stop the outer loop after 3
//            }

            for (int j = 0; j < 2; j++) {
                System.out.println("W " + j);
              //  break; //if break is here the outer loop will iterate fully,but inner loop will execute the first
                         // iteration and then the break runs
            }
            System.out.println();
            //  break; // if break is here the first iteration of the outer loop will run, then the outer loop stops
        }


    }
}
