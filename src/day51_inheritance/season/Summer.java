package day51_inheritance.season;

public class Summer extends  Season{
    /*  Create a class Summer
     	child class of Season
    	constructor: set values to variables
    	methods:   activity(): Drink Lemonade     */

    public Summer( double lowestTemperature) {
        super("Summer", 95, lowestTemperature);
    }

    @Override
    public String activity() {
        return "Drink Lemonade";
    }
}
