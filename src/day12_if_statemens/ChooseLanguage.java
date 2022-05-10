package day12_if_statemens;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose language: \n1 - English\n2 - " +
                "Spanish\n3 - Turkish\n4 - Russian\n5 - French");
        int option = scan.nextInt();
        String message;
        if(option == 1){
            message = "hello, thank for your call";
        }else if (option == 2){
            message = "hola, gracias para llamar";
        }else if(option == 3){
            message = "merhaba, aradiginmiz icin tesekkurler";
        }else if(option == 4){
            message = "privet, spasibo za vash zvonok";
        }else if(option == 5){
            message = "Merci ,pour votre appel";
        }else {
            message = "We will use English by default";
        }
        System.out.println(message);





    }
}















