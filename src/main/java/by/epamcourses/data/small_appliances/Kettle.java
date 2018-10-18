package by.epamcourses.data.small_appliances;

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
	return NAME + super.toString();
    }
}