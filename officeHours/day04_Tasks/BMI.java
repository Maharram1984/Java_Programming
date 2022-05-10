package day04_Tasks;

public class BMI {
    public static void main(String[] args) {


        double mass = 82.4;
        double height = 1.82;
        double BMI = mass / (height * height);
        System.out.println("BMI = " + BMI);


        if(BMI <= 18.5){
            System.out.println("Underweight");
        }else if(BMI >= 18.5 && BMI < 25){
            System.out.println("Normal weight");
        }else if(BMI >= 25 && BMI < 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }





























    }
}
