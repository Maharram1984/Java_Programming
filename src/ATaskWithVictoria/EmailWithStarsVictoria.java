package ATaskWithVictoria;

public class EmailWithStarsVictoria {
    public static void main(String[] args) {

        //Task input "NatavanHajinskaya@gmail.com"
        //     output Na*************ya@gmail.com
       // String[] separate = "NatavanHajinskaya@gmail.com".split("@");

        String str = "MaharramRafiyev@gmail.com";
        String arr[] = str.split("@");
        String temp = arr[0];
        String result = "";

        for (int i = 0; i < temp.length(); i++) {
            if (i >= 2 && i < temp.length() - 2) {
                result += "*";
               // continue;
            } else {
                result += temp.charAt(i);
            }
        }
        System.out.println(result + "@" +arr[1]);
    }
    }

