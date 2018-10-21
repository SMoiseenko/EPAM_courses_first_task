package by.epamcourses.entity.small_appliances;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code Kettle} is class to create real entity of {@link SmallAppliance}
 * of {@link HomeAppliances}. Add static final field <b>NAME</b> to have
 * possibility classified entity as {@code Kettle}.
 * 
 * @author Sergei Moiseenko
 * @see SmallAppliance
 * @see HomeAppliances
 */
public class Kettle extends SmallAppliance {
    static final String NAME = "Kettle";

    public Kettle(String model, String brand, int powerConsumption) {
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