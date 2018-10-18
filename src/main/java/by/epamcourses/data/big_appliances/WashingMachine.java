package by.epamcourses.data.big_appliances;

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
	return NAME + super.toString();
    }
}
