package day54_Abstraction.Person;

public class Runner {
    public static void main(String[] args) {

        Tester tester = new Tester("Maqa",38,"QA",120000);
        System.out.println(tester);
        tester.hobby();
        tester.work();
        System.out.println("=========================================");
        Chef chef = new Chef("Toni",35,"SDET",110000);
        System.out.println(chef);
        System.out.println(chef.age);
        System.out.println(chef.name);
        chef.hobby();
        chef.work();


    }

}
