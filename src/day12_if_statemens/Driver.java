package day12_if_statemens;

public class Driver {
    public static void main(String[] args) {

        int oxygenLevel = 95;
        if(oxygenLevel >= 90){
            System.out.println("Your tank is full ");
        }else if (oxygenLevel < 90 && oxygenLevel >= 80){
            System.out.println("Still ok ");
        }else if(oxygenLevel < 80 && oxygenLevel >= 70){
            System.out.println("Don't go too far ");
        }else if(oxygenLevel < 70 && oxygenLevel >= 60){
            System.out.println("Start to head back ");
        }else if(oxygenLevel < 60 && oxygenLevel >= 50){
            System.out.println("Be careful now you are at 50%");
        }





        int oxygenLevel1 = 95;
        String message;

        if(oxygenLevel1 >= 90){
            message = "Your tank is full ";
        }else if(oxygenLevel1 >= 80){
            message = "Still ok ";
        }else if(oxygenLevel1 >= 70){
             message = "Don't go too far ";
        }else if(oxygenLevel1 >= 60){
            message = "Start to head back ";
        }else if(oxygenLevel1 >= 50){
            message = "Be careful now you are at 50%";
        }else {
            message = "Dangerous";
        }

        System.out.println(message);















    }
}
