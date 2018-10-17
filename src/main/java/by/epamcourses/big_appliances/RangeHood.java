package by.epamcourses.big_appliances;

public class RangeHood extends BigAppliance {
    static final String NAME = "Range hood";

    public RangeHood(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
