package by.epamcourses.entity.big_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code Fridge} is class to create real entity of {@link BigAppliance} of
 * {@link HomeAppliances}. Add static final field <b>NAME</b> to have
 * possibility classified entity as {@code Fridge}.
 * 
 * @author Sergei Moiseenko
 * @see BigAppliance
 * @see HomeAppliances
 */
public class Fridge extends BigAppliance {
    static final String NAME = "Fridge";

    public Fridge(String model, String brand, int powerConsumption) {
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
