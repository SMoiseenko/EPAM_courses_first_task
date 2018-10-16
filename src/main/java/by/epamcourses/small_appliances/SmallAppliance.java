package by.epamcourses.small_appliances;

import by.epamcourses.home_appliances.HomeAppliances;

public abstract class SmallAppliance extends HomeAppliances {
    static final String TYPE = "Small appliance";

    public String getType() {
	return TYPE;
    }

}
