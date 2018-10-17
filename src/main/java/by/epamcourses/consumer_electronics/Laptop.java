package by.epamcourses.consumer_electronics;

public class Laptop extends ConsumerElectronics {
    static final String NAME = "Laptop";

    public Laptop(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
