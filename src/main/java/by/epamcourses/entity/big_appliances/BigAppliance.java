package by.epamcourses.entity.big_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code BigAppliance} intermediate abstract class between
 * {@link HomeAppliances} and real appliances. Add static final field
 * <b>TYPE</b> to have possibility classified type as {@code BigAppliance}.
 * 
 * @author Sergei Moiseenko
 * @see Fridge
 * @see Cooker
 * @see RangeHood
 * @see WashingMachine
 * @see HomeAppliances
 */
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
	if (isPowerStatus()) {
	    return super.toString() + "(" + TYPE + ")" + " --- ON";
	} else {
	    return super.toString() + "(" + TYPE + ")" + " --- OFF";
	}
    }

}
