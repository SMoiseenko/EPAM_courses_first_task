package by.epamcourses.data.small_appliances;

import by.epamcourses.data.HomeAppliances;

public abstract class SmallAppliance extends HomeAppliances {
    static final String TYPE = "Small appliance";

    public SmallAppliance(String model, String brand, int powerConsumption) {
	super(model, brand, powerConsumption);
    }

    public String getType() {
	return TYPE;
    }

    @Override
    public String toString() {
	if (getPowerStatus()) {
	    return super.toString() + "(" + TYPE + ")" + " --- ON";
	} else {
	    return super.toString() + "(" + TYPE + ")" + " --- OFF";
	}
    }
}