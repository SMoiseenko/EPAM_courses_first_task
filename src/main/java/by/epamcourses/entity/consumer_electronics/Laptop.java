package by.epamcourses.entity.consumer_electronics;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code Laptop} is class to create real entity of
 * {@link ConsumerElectronics} of {@link HomeAppliances}. Add static final field
 * <b>NAME</b> to have possibility classified entity as {@code Laptop}.
 * 
 * @author Sergei Moiseenko
 * @see ConsumerElectronics
 * @see HomeAppliances
 */
public class Laptop extends ConsumerElectronics {
    static final String NAME = "Laptop";

    public Laptop(String model, String brand, int powerConsumption) {
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
