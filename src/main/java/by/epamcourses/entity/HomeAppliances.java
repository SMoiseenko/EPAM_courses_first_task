package by.epamcourses.entity;

import by.epamcourses.entity.big_appliances.BigAppliance;
import by.epamcourses.entity.consumer_electronics.ConsumerElectronics;
import by.epamcourses.entity.small_appliances.SmallAppliance;

/**
 * The {@code HomeAppliances} is abstract parent class for different types of
 * home appliances. Contain common fields and methods to get their value.
 * Implements interface {@link Comparable} and override <i>compareTo</i> method
 * to sort in collection by <b>powerConsumption</b> field.
 * 
 * @author Sergei Moiseenko
 * @see BigAppliance
 * @see SmallAppliance
 * @see ConsumerElectronics
 */

public abstract class HomeAppliances implements Comparable<HomeAppliances> {
    /**
     * Field contain name of producer (brand). Fill only by constructor.
     */
    protected String brand;
    /**
     * Field contain model of appliance. Fill only by constructor.
     */
    protected String model;
    /**
     * Field contain power consumption of appliance. Fill only by constructor.
     */
    protected int powerСonsumption;
    /**
     * Field contain information is appliance turn ON or OFF. By default - OFF
     */
    protected boolean powerStatus = false;

    /**
     * Default and only one constructor for {@code HomeAppliances} to fill main
     * fields. Can throw {@link IllegalArgumentException} if fields <b>brand</b> or
     * <b>model</b> consist less that 2 characters or <b>powerConsumption</b> are
     * negative. Can't change this fields after create instance of real entity.
     * 
     * @param brand
     * @param model
     * @param powerСonsumption
     */
    public HomeAppliances(String brand, String model, int powerСonsumption) {
	if (brand.length() < 2) {
	    throw new IllegalArgumentException("Brand must consist minimum two characters.");
	}
	this.brand = brand;

	if (model.length() < 2) {
	    throw new IllegalArgumentException("Model must consist minimum two characters.");
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

    public boolean isPowerStatus() {
	return powerStatus;
    }

    public void setPowerStatus(boolean set) {
	powerStatus = set;
    }

    public abstract String getType();

    public abstract String getName();

    /**
     * This method add possibility to sort collection of {@link HomeAppliances} type
     * by {@code powerConsunption} field.
     */
    public int compareTo(HomeAppliances pow) {
	return (powerСonsumption - pow.getPowerСonsumption());
    }

    @Override
    public String toString() {
	return " " + brand + " - " + model + "\", " + powerСonsumption + " W. ";
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
