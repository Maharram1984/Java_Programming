package day51_inheritance.season;

public class Fall extends Season {
    /*  Create a class Fall
    	child class of Season
    	constructor: set values to variables
    	methods: activity(): Read A Book      */

    public Fall( double highestTemperature) {
        super("Fall", highestTemperature,40);
    }

    @Override
    public String activity() {
        return "Read a book";
    }
}
