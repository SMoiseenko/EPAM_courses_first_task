package by.epamcourses.small_appliances;

public class Toaster extends SmallAppliance {
    static final String NAME = "Toaster";

    public Toaster(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
