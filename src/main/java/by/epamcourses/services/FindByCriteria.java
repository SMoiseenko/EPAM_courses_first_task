package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.entity.HomeAppliances;

public class FindByCriteria {

    public ArrayList<HomeAppliances> findByPower(ArrayList<HomeAppliances> findInME, int from, int till) {
	ArrayList<HomeAppliances> findedByPowerList = new ArrayList<HomeAppliances>();
	for (HomeAppliances isIOk : findInME) {
	    if (isIOk.getPowerСonsumption() >= from && (isIOk.getPowerСonsumption() <= till)) {
		findedByPowerList.add(isIOk);
	    }
	}
	return findedByPowerList;
    }

    public ArrayList<HomeAppliances> findByName(ArrayList<HomeAppliances> findInME, String name) {
	ArrayList<HomeAppliances> findedByNameList = new ArrayList<HomeAppliances>();
	for (HomeAppliances isIOk : findInME) {
	    if (isIOk.getName().equalsIgnoreCase(name)) {
		findedByNameList.add(isIOk);
	    }
	}
	return findedByNameList;
    }

}
