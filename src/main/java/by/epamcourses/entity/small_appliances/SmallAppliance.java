package by.epamcourses.entity.small_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code SmallAppliance} intermediate abstract class between
 * {@link HomeAppliances} and real appliances. Add static final field
 * <b>TYPE</b> to have possibility classified type as {@code SmallAppliance}.
 * 
 * @author Sergei Moiseenko
 * @see Kettle
 * @see Toaster
 * @see VacuumCleaner
 * @see Сhandelier
 * @see HomeAppliances
 */
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
	if (isPowerStatus()) {
	    return super.toString() + "(" + TYPE + ")" + " --- ON";
	} else {
	    return super.toString() + "(" + TYPE + ")" + " --- OFF";
	}
    }
}