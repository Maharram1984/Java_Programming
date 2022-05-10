package day51_inheritance.season;

public class Winter extends Season{
 /* Create a class Winter
	child class of Season
    constructor: set values to variables
	methods:  activity(): Print Use Fireplace     */

    public Winter() {
        super("Winter",40,26);
    }

    @Override
    public String activity() {
        return "Use fireplace";
    }
}
