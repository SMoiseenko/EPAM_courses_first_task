package by.epamcourses.entity.consumer_electronics;

import by.epamcourses.entity.HomeAppliances;

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