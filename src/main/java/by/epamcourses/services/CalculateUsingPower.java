package by.epamcourses.services;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code CalculateUsingPower} consist one method to calculate using power.
 * If <b>powerStatus</b> is <b>true</b>, method summarizes
 * <b>powerConsumption</b> field(s).
 * <p>
 * List of parameters: <br>
 * <i>ArrayList</i> - initial collection of all appliances.<br>
 * Return type:<br>
 * <i>int</i> - type of calculated power consumption value.
 * 
 * @author Sergei Moiseenko
 * @see HomeAppliances
 */
public class CalculateUsingPower {

   private final static Logger logger = Logger.getLogger(CalculateUsingPower.class);

    public int calculateUsingPower(ArrayList<HomeAppliances> homeAppliances) {
	if (logger.isInfoEnabled()) {
	    logger.info("List of initial appliances\n" + homeAppliances);
	}
	int powCons = 0;
	for (HomeAppliances aList : homeAppliances) {
	    if (aList.isPowerStatus() == true) {
		powCons += aList.getPowerСonsumption();
	    }
	}
	if (logger.isInfoEnabled()) {
	    logger.info("Calculated power consumption= " + powCons);
	}
	return powCons;
    }
}
