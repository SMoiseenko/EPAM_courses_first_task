package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.data.HomeAppliances;

public class SwitchOnSomeAppliances {

    public static ArrayList<HomeAppliances> swichedOn(ArrayList<HomeAppliances> flatAppliances, int[] switchThis) {
	ArrayList<HomeAppliances> switchedApplianceList = new ArrayList<>();

	int a = 0;
	for (int pos : switchThis) {
	    try {
		switchedApplianceList.add(flatAppliances.get(pos));
		switchedApplianceList.get(a).setPowerStatus(true);
		++a;
	    } catch (IndexOutOfBoundsException e) {
		System.err.println(pos + " -  no such element");
	    }

	}
	return switchedApplianceList;
    }
}
