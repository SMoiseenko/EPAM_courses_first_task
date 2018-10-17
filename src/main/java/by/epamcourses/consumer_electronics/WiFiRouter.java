package by.epamcourses.consumer_electronics;

public class WiFiRouter extends ConsumerElectronics {
    static final String NAME = "WiFi Router";

    public WiFiRouter() {
    }

    public WiFiRouter(String model, int powerConsumption) {
	this.model = model;
	this.powerСonsumption = powerConsumption;
    }

    public String getName() {
	return NAME;
    }

}
