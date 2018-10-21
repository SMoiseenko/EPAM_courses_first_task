package by.epamcourses.entity.consumer_electronics;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code WiFiRouter} is class to create real entity of
 * {@link ConsumerElectronics} of {@link HomeAppliances}. Add static final field
 * <b>NAME</b> to have possibility classified entity as {@code WiFiRouter}.
 * 
 * @author Sergei Moiseenko
 * @see ConsumerElectronics
 * @see HomeAppliances
 */
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
	return "\n " + NAME + super.toString();
    }
}
