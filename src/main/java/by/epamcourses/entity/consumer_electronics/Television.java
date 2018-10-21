package by.epamcourses.entity.consumer_electronics;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code Television} is class to create real entity of
 * {@link ConsumerElectronics} of {@link HomeAppliances}. Add static final field
 * <b>NAME</b> to have possibility classified entity as {@code Television}.
 * 
 * @author Sergei Moiseenko
 * @see ConsumerElectronics
 * @see HomeAppliances
 */
public class Television extends ConsumerElectronics {
    static final String NAME = "Television";

    public Television(String model, String brand, int powerConsumption) {
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
