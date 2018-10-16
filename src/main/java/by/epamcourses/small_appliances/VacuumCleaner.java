package by.epamcourses.small_appliances;

public class VacuumCleaner extends SmallAppliance {
    static final String NAME = "Vacuum cleaner";

    public VacuumCleaner() {
    }

    public VacuumCleaner(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
