package by.epamcourses.entity.big_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code WashingMachine} is class to create real entity of
 * {@link BigAppliance} of {@link HomeAppliances}. Add static final field
 * <b>NAME</b> to have possibility classified entity as {@code WashingMachine}.
 * 
 * @author Sergei Moiseenko
 * @see BigAppliance
 * @see HomeAppliances
 */
public class WashingMachine extends BigAppliance {

    static final String NAME = "Washing machine";

    public WashingMachine(String model, String brand, int powerConsumption) {
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
