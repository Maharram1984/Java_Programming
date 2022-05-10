package day51_inheritance.season;

public class Season {
 /* Create a class Season
	instance variables - name (String)
    - highest average temperature
	- the lowest average temperature
	constructor: - initialize all fields
	methods: - activity(), toString()
	override activity in subclasses */

    String name;
    double highestTemperature;
    double lowestTemperature;

    public Season(String name, double highestTemperature, double lowestTemperature) {
        this.name = name;
        this.highestTemperature = highestTemperature;
        this.lowestTemperature = lowestTemperature;
    }

    public String activity() {
        return "";
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestTemperature=" + highestTemperature +
                ", lowestTemperature=" + lowestTemperature +
                '}';
    }
}
