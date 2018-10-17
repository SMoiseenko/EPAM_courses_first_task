package by.epamcourses.small_appliances;

public class Сhandelier extends SmallAppliance {
    static final String NAME = "Сhandelier";

    public Сhandelier(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }
}
