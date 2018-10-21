package by.epamcourses.entity.big_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code RangeHood} is class to create real entity of {@link BigAppliance}
 * of {@link HomeAppliances}. Add static final field <b>NAME</b> to have
 * possibility classified entity as {@code RangeHood}.
 * 
 * @author Sergei Moiseenko
 * @see BigAppliance
 * @see HomeAppliances
 */
public class RangeHood extends BigAppliance {
    static final String NAME = "Range hood";

    public RangeHood(String model, String brand, int powerConsumption) {
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
