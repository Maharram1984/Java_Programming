package day53_abstraction.Exercise;

public abstract class Exercise {

    final String name;

    public Exercise(String name){
        this.name = name;
    }
    public abstract void exerciseOne();

    public abstract int getCaloriesBurned(int minutes);


}
