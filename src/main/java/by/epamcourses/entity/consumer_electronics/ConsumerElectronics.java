package by.epamcourses.entity.consumer_electronics;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code ConsumerElectronics} intermediate abstract class between
 * {@link HomeAppliances} and real appliances. Add static final field
 * <b>TYPE</b> to have possibility classified type as
 * {@code ConsumerElectronics}.
 * 
 * @author Sergei Moiseenko
 * @see Television
 * @see Laptop
 * @see Smartphone
 * @see SoundBar
 * @see WiFiRouter
 * @see HomeAppliances
 */
public abstract class ConsumerElectronics extends HomeAppliances {
    static final String TYPE = "Consumer electronics";

    public ConsumerElectronics(String model, String brand, int powerConsumption) {
	super(model, brand, powerConsumption);
    }

    public String getType() {
	return TYPE;
    }

    @Override
    public String toString() {
	if (isPowerStatus()) {
	    return super.toString() + "(" + TYPE + ")" + " --- ON";
	} else {
	    return super.toString() + "(" + TYPE + ")" + " --- OFF";
	}
    }
}