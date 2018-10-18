package by.epamcourses.services;

import java.util.ArrayList;

import by.epamcourses.data.HomeAppliances;

public class CalculateUsingPower {

    public int calculateUsingPower(ArrayList<HomeAppliances> homeAppliances) {
	int powCons = 0;
	for (HomeAppliances aList : homeAppliances) {
	    if (aList.getPowerStatus() == true) {
		powCons += aList.getPowerСonsumption();
	    }
	}
	return powCons;
    }
}
