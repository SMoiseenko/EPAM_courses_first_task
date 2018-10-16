package by.epamcourses.big_appliances;

public class Cooker extends BigAppliance {
    static final String NAME = "Cooker";

    public Cooker() {
    }

    public Cooker(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
