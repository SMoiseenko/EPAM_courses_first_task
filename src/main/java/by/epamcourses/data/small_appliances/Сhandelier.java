package by.epamcourses.data.small_appliances;

public class Сhandelier extends SmallAppliance {
    static final String NAME = "Сhandelier";

    public Сhandelier(String model, String brand, int powerConsumption) {
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
