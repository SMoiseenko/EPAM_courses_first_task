package by.epamcourses.data.consumer_electronics;

public class WiFiRouter extends ConsumerElectronics {
    static final String NAME = "WiFi Router";

    public WiFiRouter(String model, String brand, int powerConsumption) {
	super(model, brand, powerConsumption);
    }

    public String getName() {
	return NAME;
    }

    @Override
    public String toString() {
	return NAME + super.toString();
    }
}
