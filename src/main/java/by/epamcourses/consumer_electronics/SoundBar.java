package by.epamcourses.consumer_electronics;

public class SoundBar extends ConsumerElectronics {
    static final String NAME = "Sound Bar";

    public SoundBar() {
    }

    public SoundBar(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
