package by.epamcourses.services;

import by.epamcourses.data.HomeAppliances;

public class SwitchOnOffAll {
    public static void swithedOnAll() {

	for (HomeAppliances aList : DeepCollectionCopy.switchListCopy) {
	    aList.setPowerStatus(true);
	}
	System.out.println("All appliances switched ON now.\n");
    }

    public static void swithedOffAll() {

	for (HomeAppliances aList : DeepCollectionCopy.switchListCopy) {
	    aList.setPowerStatus(false);
	}
	System.out.println("All appliances switched OFF now.\n");
    }

}
