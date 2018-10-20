package by.epamcourses.entity.consumer_electronics;

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
