package by.epamcourses.data.consumer_electronics;

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
	return NAME + super.toString();
    }
}
