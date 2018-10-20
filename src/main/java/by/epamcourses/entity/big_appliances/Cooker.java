package by.epamcourses.entity.big_appliances;

public class Cooker extends BigAppliance {
    static final String NAME = "Cooker";

    public Cooker(String model, String brand, int powerConsumption) {
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
