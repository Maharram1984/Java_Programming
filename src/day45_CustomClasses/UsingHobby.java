package day45_CustomClasses;

import day_15.ArrayListIntro2;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingHobby {
    public static void main(String[] args) {

        ArrayList<Hobby> allHobbies = new ArrayList<>();
        allHobbies.add(new Hobby("Soccer",800,true,true));
        allHobbies.add(new Hobby("Tennis",1000,true,true));
        System.out.println(allHobbies);

        allHobbies.addAll(Arrays.asList(
                new Hobby("Volleyball",400,true,true),
                new Hobby("Running",10,true,false),
                new Hobby("Playing dominoes",10,false,true)
        ));
        System.out.println(allHobbies);

        for (Hobby each:allHobbies){
            each.doIt();
        }
        ArrayList<Hobby> coast = new ArrayList<>(allHobbies);
        coast.removeIf(hobby -> hobby.annualCost > 300);
        System.out.println(coast);

        ArrayList<Hobby> indoorHobbies = new ArrayList<>(allHobbies);
        indoorHobbies.removeIf(hobby -> hobby.isOutDoor);
        System.out.println(indoorHobbies);

        ArrayList<Hobby> individual = new ArrayList<>(allHobbies);
        individual.removeIf(hobby -> hobby.requiresOthers);
        System.out.println(individual);

        ArrayList<Hobby> expense = new ArrayList<>(allHobbies);
        expense.removeIf(hobby -> hobby.annualCost <900);
        System.out.println(expense);




















    }
}
