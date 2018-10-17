package by.epamcourses.consumer_electronics;

public class SoundBar extends ConsumerElectronics {
    static final String NAME = "Sound Bar";

    public SoundBar(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
