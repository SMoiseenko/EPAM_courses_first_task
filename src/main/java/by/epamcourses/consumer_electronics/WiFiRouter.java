package by.epamcourses.consumer_electronics;

public class WiFiRouter extends ConsumerElectronics {
    static final String NAME = "WiFi Router";

    public WiFiRouter(String model, String brand, int powerConsumption) {
	this.model = model;
	this.brand = brand;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
