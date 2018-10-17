package by.epamcourses.small_appliances;

public class Kettle extends SmallAppliance {
    static final String NAME = "Kettle";

    public Kettle(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
