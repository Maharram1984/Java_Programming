package day51_inheritance.season;

public class Spring extends Season {
    /*  Create a class Spring
    	child class of Season
    	constructor: set values to variables
    	methods: activity(): Go Outside     */

    public Spring(double highestTemperature, double lowestTemperature) {
        super("Spring", highestTemperature, lowestTemperature);
    }

    @Override
    public String activity() {
        return "Go outside";
    }
}
