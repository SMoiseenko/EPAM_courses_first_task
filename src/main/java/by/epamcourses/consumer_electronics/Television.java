package by.epamcourses.consumer_electronics;

public class Television extends ConsumerElectronics {
    static final String NAME = "Television";

    public Television(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
