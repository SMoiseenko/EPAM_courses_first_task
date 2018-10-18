package by.epamcourses.data.big_appliances;

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
	return NAME + super.toString();
    }
}
