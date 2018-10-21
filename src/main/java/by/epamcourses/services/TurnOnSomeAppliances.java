package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.log4j.Logger;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code TurnOnSomeAppliances} consist one method to turn ON choosed
 * appliance(s). In choosed appliances <b>powerStatus</b> will changed to
 * <b>ON</b>
 * <p>
 * List of parameters: <br>
 * <i>ArrayList</i> - initial collection of all appliances.<br>
 * <i>int</i> - array of index(es) of appliances in initial collection that need
 * to turn ON.<br>
 * Return type:<br>
 * <i>ArrayList</i> - collection of all appliance(s) that was(were) turn on.
 * 
 * @author Sergei Moiseenko
 * @see HomeAppliances
 */
public class TurnOnSomeAppliances {

    final static Logger logger = Logger.getLogger(TurnOnSomeAppliances.class);

    public ArrayList<HomeAppliances> turnOn(ArrayList<HomeAppliances> flatAppliances, int[] switchThis) {
	ArrayList<HomeAppliances> turnOnApplianceList = new ArrayList<>();
	if (logger.isInfoEnabled()) {
	    logger.info("Turn on appliances with next index(es)" + Arrays.toString(switchThis) + " in collection" + "\n"
		    + flatAppliances);
	}
	int a = 0;
	for (int pos : switchThis) {
	    try {
		turnOnApplianceList.add(flatAppliances.get(pos));
		turnOnApplianceList.get(a).setPowerStatus(true);
		++a;
	    } catch (IndexOutOfBoundsException e) {
		logger.error(pos + " -  no such element");
	    }
	}
	if (logger.isInfoEnabled()) {
	    logger.info("Collection of all appliance(s) that was(were) turn on\n" + turnOnApplianceList);
	}
	return turnOnApplianceList;
    }
}
