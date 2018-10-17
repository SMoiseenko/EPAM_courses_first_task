package by.epamcourses.small_appliances;

public class VacuumCleaner extends SmallAppliance {
    static final String NAME = "Vacuum cleaner";

    public VacuumCleaner(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
