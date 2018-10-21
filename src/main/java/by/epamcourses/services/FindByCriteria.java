package by.epamcourses.services;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.log4j.Logger;

import by.epamcourses.entity.HomeAppliances;

/**
 * The {@code FindByCriteria} consist two methods:<br>
 * <b>findByPower</b> - to find appliance(s) in the specified range of power
 * consumption.<br>
 * List of parameters: <br>
 * <i>ArrayList</i> - initial collection of all appliances.<br>
 * <i>int</i> - beginner value in specified range.<br>
 * <i>int</i> -final value in specified range.<br>
 * Return type:<br>
 * <i>ArrayList</i> - collection of all appliances with power consumption in
 * specified range.
 * <p>
 * <b>findByName</b> - to find appliance(s) by name .<br>
 * List of parameters: <br>
 * <i>ArrayList</i> - initial collection of all appliance(s).<br>
 * <i>String</i> - specified name. Characters case is ignore.<br>
 * Return type:<br>
 * <i>ArrayList</i> - collection of all appliance(s) with specified name .
 * 
 * @author Sergei Moiseenko
 * @see HomeAppliances
 */
public class FindByCriteria {

    final static Logger logger = Logger.getLogger(FindByCriteria.class);

    public ArrayList<HomeAppliances> findByPower(ArrayList<HomeAppliances> findInME, int from, int till) {
	if (logger.isInfoEnabled()) {
	    logger.info("Find in next all appliances with power consumprion from " + from + " till " + till + "\n"
		    + findInME);
	}
	ArrayList<HomeAppliances> findedByPowerList = new ArrayList<>();
	for (HomeAppliances isIOk : findInME) {
	    if (isIOk.getPowerСonsumption() >= from && (isIOk.getPowerСonsumption() <= till)) {
		findedByPowerList.add(isIOk);
	    }
	}
	Collections.sort(findedByPowerList);
	if (logger.isInfoEnabled()) {
	    logger.info("Collection of all appliances with power consumption in specified range\n" + findedByPowerList);
	}
	return findedByPowerList;
    }

    public ArrayList<HomeAppliances> findByName(ArrayList<HomeAppliances> findInME, String name) {
	if (logger.isInfoEnabled()) {
	    logger.info("Find in next all appliances with name " + name + "\n" + findInME);
	}
	ArrayList<HomeAppliances> findedByNameList = new ArrayList<>();
	for (HomeAppliances isIOk : findInME) {
	    if (isIOk.getName().equalsIgnoreCase(name)) {
		findedByNameList.add(isIOk);
	    }
	}
	if (logger.isInfoEnabled()) {
	    logger.info("Collection of all appliances with specified name\n" + findedByNameList);
	}
	return findedByNameList;
    }
}
