package by.epamcourses.small_appliances;

public class Toaster extends SmallAppliance {
    static final String NAME = "Toaster";

    public Toaster() {
    }

    public Toaster(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
