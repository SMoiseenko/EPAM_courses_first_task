package by.epamcourses.entity.consumer_electronics;

public class Smartphone extends ConsumerElectronics {
    static final String NAME = "Smartphone";

    public Smartphone(String model, String brand, int powerConsumption) {
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