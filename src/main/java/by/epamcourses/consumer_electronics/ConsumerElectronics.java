package by.epamcourses.consumer_electronics;

import by.epamcourses.home_appliances.HomeAppliances;

public abstract class ConsumerElectronics extends HomeAppliances {
    static final String TYPE = "Consumer electronics";

    public String getType() {
	return TYPE;
    }

}
