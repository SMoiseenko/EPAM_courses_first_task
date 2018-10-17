package by.epamcourses.big_appliances;

public class Fridge extends BigAppliance {
    static final String NAME = "Fridge";

    public Fridge(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
