package by.epamcourses.big_appliances;

public class RangeHood extends BigAppliance {
    static final String NAME = "Range hood";

    public RangeHood() {
    }

    public RangeHood(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
