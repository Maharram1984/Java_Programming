package day53_abstraction.Exercise;

public class Running extends Exercise{

    public Running() {
        super("Running....");
    }

    @Override
    public void exerciseOne() {
        System.out.println("Running for fun");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
        return minutes * 5;
    }
}
