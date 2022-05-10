package day23_ForLoop;

public class CountHi {
    public static void main(String[] args) {

        String str = "fgdhihihihjkhih";
        int count = 0;
                                                       // TODO:  -1 bec. of last "h" was +1  we need to stop  it..
        for (int i = 0; i < str.length() -1  ;i++){

            if (str.charAt(i) == 'h' && str.charAt(i + 1) =='i'){
                count++;
            }
        }
                      System.out.println(count);




















    }
}