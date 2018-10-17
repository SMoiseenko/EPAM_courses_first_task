package by.epamcourses.services;

import by.epamcourses.home_appliances.HomeAppliances;

public class CalculateUsingPower {

    public static void calculateUsingPower() {
	int powCons = 0;
	for (HomeAppliances aList : DeepCollectionCopy.switchListCopy) {
	    if (aList.getPowerStatus().equals("ON")) {
		powCons += aList.getPowerСonsumption();
	    }
	}
	if (powCons != 0) {
	    System.out.println("Total power consumption of all switched ON appliance(s) = " + powCons + " W.\n");
	} else {
	    System.out.println("All apliances switches OFF. No any power consumption.\n");
	}
    }
}
