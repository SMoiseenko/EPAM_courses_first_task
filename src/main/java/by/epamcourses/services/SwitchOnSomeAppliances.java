package by.epamcourses.services;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import by.epamcourses.entity.HomeAppliances;

/**
 * Method to switch on any appliances
 */
public class SwitchOnSomeAppliances {

    final static Logger logger = Logger.getLogger(SwitchOnSomeAppliances.class);

    public ArrayList<HomeAppliances> swichedOn(ArrayList<HomeAppliances> flatAppliances, int[] switchThis) {
	ArrayList<HomeAppliances> switchedApplianceList = new ArrayList<>();

	int a = 0;
	for (int pos : switchThis) {
	    try {
		switchedApplianceList.add(flatAppliances.get(pos));
		switchedApplianceList.get(a).setPowerStatus(true);
		++a;
	    } catch (IndexOutOfBoundsException e) {
		logger.error(pos + " -  no such element");
	    }
	}

	return switchedApplianceList;
    }
}
