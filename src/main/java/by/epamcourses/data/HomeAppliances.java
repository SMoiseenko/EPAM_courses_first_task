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

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((model == null) ? 0 : model.hashCode());
	result = prime * result + (powerStatus ? 1231 : 1237);
	result = prime * result + powerСonsumption;
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (!(obj instanceof HomeAppliances))
	    return false;
	HomeAppliances other = (HomeAppliances) obj;
	if (brand == null) {
	    if (other.brand != null)
		return false;
	} else if (!brand.equals(other.brand))
	    return false;
	if (model == null) {
	    if (other.model != null)
		return false;
	} else if (!model.equals(other.model))
	    return false;
	if (powerStatus != other.powerStatus)
	    return false;
	if (powerСonsumption != other.powerСonsumption)
	    return false;
	return true;
    }

}
