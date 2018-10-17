package by.epamcourses.consumer_electronics;

public class Television extends ConsumerElectronics {
    static final String NAME = "Television";

    public Television() {
    }

    public Television(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
