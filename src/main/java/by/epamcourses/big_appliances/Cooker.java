package by.epamcourses.big_appliances;

public class Cooker extends BigAppliance {
    static final String NAME = "Cooker";

    public Cooker(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
