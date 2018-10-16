package by.epamcourses.big_appliances;

public class WashingMachine extends BigAppliance {

    static final String NAME = "Washing machine";

    public WashingMachine(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
