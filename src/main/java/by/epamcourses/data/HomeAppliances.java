package by.epamcourses.data;

public abstract class HomeAppliances implements Comparable<HomeAppliances>, Cloneable {
    protected String brand;
    protected String model;
    protected int powerСonsumption;
    protected boolean powerStatus = false;

    public HomeAppliances(String brand, String model, int powerСonsumption) {
	if (brand.length() < 2) {
	    throw new IllegalArgumentException("Brand must consist minimum two characters.");
	}
	this.brand = brand;
	if (brand.length() < 2) {
	    throw new IllegalArgumentException("Brand must consist minimum two characters.");
	}
	this.model = model;
	if (powerСonsumption <= 0) {
	    throw new IllegalArgumentException("Power consumption must be higher than 0 Watt.");
	}
	this.powerСonsumption = powerСonsumption;
    }

    public String getModel() {
	return model;
    }

    public String getBrandl() {
	return brand;
    }

    public int getPowerСonsumption() {
	return powerСonsumption;
    }

    public abstract String getType();

    public abstract String getName();

    public int compareTo(HomeAppliances pow) {
	return (powerСonsumption - pow.getPowerСonsumption());
    }

    public boolean isPowerStatus() {
	return powerStatus;
    }

    public void setPowerStatus(boolean set) {
	powerStatus = set;
    }

    @Override
    public HomeAppliances clone() {
	HomeAppliances clone = null;
	try {
	    clone = (HomeAppliances) super.clone();
	} catch (CloneNotSupportedException e) {
	    throw new RuntimeException(e);
	}
	return clone;
    }

    @Override
    public String toString() {
	return " \"" + brand + " - " + model + "\", " + powerСonsumption + " W. ";
    }

}
