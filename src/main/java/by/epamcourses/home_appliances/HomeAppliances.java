package by.epamcourses.home_appliances;

public abstract class HomeAppliances implements Comparable<HomeAppliances>, Cloneable {
    protected String model;
    protected int powerСonsumption;
    protected boolean powerStatus = false;

    public String getPowerStatus() {
	if (powerStatus) {
	    return "ON";
	} else
	    return "OFF";
    }

    public void setPowerStatus(boolean powerStatus) {
	this.powerStatus = powerStatus;
    }

    public String getModel() {
	return model;
    }

    public abstract String getType();

    public abstract String getName();

    public int getPowerСonsumption() {
	return powerСonsumption;
    }

    public int compareTo(HomeAppliances pow) {
	return (powerСonsumption - pow.getPowerСonsumption());
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

}
