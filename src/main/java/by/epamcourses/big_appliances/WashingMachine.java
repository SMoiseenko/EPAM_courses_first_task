package by.epamcourses.big_appliances;

public class WashingMachine extends BigAppliance {

    static final String NAME = "Washing machine";

    public WashingMachine(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
