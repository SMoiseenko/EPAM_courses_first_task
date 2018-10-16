package by.epamcourses.big_appliances;

;

public class Fridge extends BigAppliance {
    static final String NAME = "Fridge";

    public Fridge() {
    }

    public Fridge(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
