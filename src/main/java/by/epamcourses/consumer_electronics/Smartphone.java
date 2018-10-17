package by.epamcourses.consumer_electronics;

public class Smartphone extends ConsumerElectronics {
    static final String NAME = "Smartphone";

    public Smartphone() {
    }

    public Smartphone(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
