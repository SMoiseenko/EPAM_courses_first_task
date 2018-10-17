package by.epamcourses.consumer_electronics;

public class Smartphone extends ConsumerElectronics {
    static final String NAME = "Smartphone";

    public Smartphone(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
