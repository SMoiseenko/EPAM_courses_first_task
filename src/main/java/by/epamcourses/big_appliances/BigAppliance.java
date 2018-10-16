package by.epamcourses.big_appliances;

import by.epamcourses.home_appliances.HomeAppliances;

public abstract class BigAppliance extends HomeAppliances {
    static final String TYPE = "Big appliance";

    public String getType() {
	return TYPE;
    }

}
