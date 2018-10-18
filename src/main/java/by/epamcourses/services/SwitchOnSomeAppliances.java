package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.data.HomeAppliances;

public class SwitchOnSomeAppliances {

    public static ArrayList<HomeAppliances> swichedOn(ArrayList<HomeAppliances> flatAppliances, int[] switchThis) {
	ArrayList<HomeAppliances> switchedApplianceList = new ArrayList<>();
	for (int i = 0; i < switchThis.length; i++) {
	    try {
		// switchedApplianceList.add(flatAppliances.get(switchThis[i]));
		// switchedApplianceList.get(i).setPowerStatus(true);
		flatAppliances.get(switchThis[i]).setPowerStatus(true);
	    } catch (IndexOutOfBoundsException e) {
		System.err.println(switchThis[i] + " -  no such element");
	    }

	}
	return flatAppliances;
    }
}
