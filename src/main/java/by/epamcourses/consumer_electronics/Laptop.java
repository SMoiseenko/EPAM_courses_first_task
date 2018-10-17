package by.epamcourses.consumer_electronics;

public class Laptop extends ConsumerElectronics {
    static final String NAME = "Laptop";

    public Laptop() {
    }

    public Laptop(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
