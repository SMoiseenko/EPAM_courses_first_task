package by.epamcourses.small_appliances;

public class Kettle extends SmallAppliance {
    static final String NAME = "Kettle";

    public Kettle() {
    }

    public Kettle(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
