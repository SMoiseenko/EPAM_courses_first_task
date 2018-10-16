package by.epamcourses.small_appliances;

public class Сhandelier extends SmallAppliance {
    static final String NAME = "Сhandelier";

    public Сhandelier() {
    }

    public Сhandelier(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
