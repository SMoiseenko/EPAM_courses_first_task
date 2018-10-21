package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code SortedByPower} consist one method <b>sortedByPower</b> - to sort
 * collection of appliance(s) by power consumption.<br>
 * <b>WARNING</b> Sorting is done in the initial collection.<br>
 * List of parameters: <br>
 * <i>ArrayList</i> - initial collection of all appliances.<br>
 * Return type:<br>
 * <i>ArrayList</i> - sorted by power consumption collection.
 * 
 * @author Sergei Moiseenko
 * @see HomeAppliances
 */
public class SortedByPower {
    final static Logger logger = Logger.getLogger(SortedByPower.class);

    public ArrayList<HomeAppliances> sortedByPower(ArrayList<HomeAppliances> sortMe) {
	if (logger.isInfoEnabled()) {
	    logger.info("Initial collection before sorted by power consuption \n" + sortMe);
	}
	Collections.sort(sortMe);
	if (logger.isInfoEnabled()) {
	    logger.info("Initial collection after sorted by power consuption \n" + sortMe);
	}
	return sortMe;
    }
}
