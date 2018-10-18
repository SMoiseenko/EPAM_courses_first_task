package by.epamcourses.data.big_appliances;

import by.epamcourses.data.HomeAppliances;

public abstract class BigAppliance extends HomeAppliances {
    static final String TYPE = "Big appliance";

    public BigAppliance(String model, String brand, int powerConsumption) {
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
